package com.inquiry.inquirypaymentrequests.config;

import com.inquiry.inquirypaymentrequests.enums.DatabaseEnvironment;
import com.inquiry.inquirypaymentrequests.repository.KpaymDistRepository;
import com.inquiry.inquirypaymentrequests.util.DataSourceRouter;
import com.inquiry.inquirypaymentrequests.model.KpaymDistr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration()
@EnableJpaRepositories(basePackageClasses = KpaymDistRepository.class, entityManagerFactoryRef = "paymentEntityManager", transactionManagerRef = "paymentTransactionManager")
@EnableTransactionManagement
public class DataSourceConfiguration {

    @Autowired(required = false)
    private PersistenceUnitManager persistenceUnitManager;

    @Value("${app.payment.development.datasource.jdbcUrl}")
    private String developmentUrl;
    @Value("${app.payment.testing.datasource.jdbcUrl}")
    private String testUrl;
    @Value("${app.payment.production.datasource.jdbcUrl}")
    private String prodUrl;

    @Bean
    @Primary
    @ConfigurationProperties("app.payment.jpa")
    public JpaProperties paymentJpaProperties() {
        return new JpaProperties();
    }

    @Bean
    @ConfigurationProperties("app.payment.development.datasource")
    public DataSource paymentDevelopmentDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(developmentUrl);
        dataSourceBuilder.username("sa");
        DataSource build = dataSourceBuilder.build();
        return build;
    }

    @Bean
    @ConfigurationProperties(prefix = "app.payment.testing.datasource")
    public DataSource paymentTestingDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(testUrl);
        dataSourceBuilder.username("sa");
        DataSource build = dataSourceBuilder.build();
        return build;
    }

    @Bean
    @ConfigurationProperties(prefix = "app.payment.production.datasource")
    public DataSource paymentProductionDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(prodUrl);
        dataSourceBuilder.username("sa");
        DataSource build = dataSourceBuilder.build();
        return build;
    }

    /**
     * Adds all available datasources to datasource map.
     *
     * @return datasource of current context
     */
    @Bean
    @Primary
    public DataSource paymentDataSource() {
        DataSourceRouter router = new DataSourceRouter();

        final HashMap<Object, Object> map = new HashMap<>(3);
        map.put(DatabaseEnvironment.DEVELOPMENT,
                paymentDevelopmentDataSource());
        map.put(DatabaseEnvironment.TESTING, paymentTestingDataSource());
        map.put(DatabaseEnvironment.PRODUCTION, paymentProductionDataSource());
        router.setTargetDataSources(map);
        return router;
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean paymentEntityManager(
            final JpaProperties paymentJpaProperties) {

        EntityManagerFactoryBuilder builder =
                createEntityManagerFactoryBuilder(paymentJpaProperties);

        return builder.dataSource(paymentDataSource()).packages(KpaymDistr.class)
                .persistenceUnit("paymentEntityManager").build();
    }

    @Bean
    @Primary
    public JpaTransactionManager paymentTransactionManager(
            @Qualifier("paymentEntityManager") final EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }

    private EntityManagerFactoryBuilder createEntityManagerFactoryBuilder(
            JpaProperties paymentJpaProperties) {
        JpaVendorAdapter jpaVendorAdapter =
                createJpaVendorAdapter(paymentJpaProperties);
        return new EntityManagerFactoryBuilder(jpaVendorAdapter,
                paymentJpaProperties.getProperties(), this.persistenceUnitManager);
    }

    private JpaVendorAdapter createJpaVendorAdapter(
            JpaProperties jpaProperties) {
        AbstractJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setShowSql(jpaProperties.isShowSql());
        adapter.setDatabase(jpaProperties.getDatabase());
        adapter.setDatabasePlatform(jpaProperties.getDatabasePlatform());
        adapter.setGenerateDdl(jpaProperties.isGenerateDdl());
        return adapter;
    }
}