package com.inquiry.inquirypaymentrequests.repository;

import com.inquiry.inquirypaymentrequests.model.KpaymDistr;
import org.springframework.data.repository.CrudRepository;

public interface KpaymDistRepository extends CrudRepository<KpaymDistr, Long> {

//    @Cacheable("kpaymdistr")
    KpaymDistr findOneByName(String name);
}
