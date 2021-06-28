package com.inquiry.inquirypaymentrequests.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "K_PAYM_DISTR")
public class KpaymDistr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "request_id", nullable = false)
    private Integer requestid;

    @Column(name = "request_date")
    private Date requestDate;

    @Column(name = "Request_mod_date")
    private Date requestModDate;

    @Column(name = "id_type")
    private Date idType;

    @Column(name = "account_no", nullable = false)
    private String accountNo;

    @Column(name = "msisdn")
    private Date msisdn;

    @Column(name = "invoice_number")
    private Date invoiceNumber;

    @Column(name = "bill_ref_no")
    private Date billRefNo;

    @Column(name = "bill_ref_resets")
    private Date billRefResets;


    @Column(name = "due_date")
    private Date dueDate;


    @Column(name = "invoice_due_amaunt")
    private Date InvoiceDueAmount;


    @Column(name = "payment_due_amount")
    private Date paymentDueAmount;


    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_surname")
    private String custSurName;


    @Column(name = "cust_company")
    private String custCompany;


    @Column(name = "payment_period")
    private String paymentPeriod;


    @Column(name = "request_status")
    private Integer requestStatus;


    @Column(name = "action_required_ots")
    private Integer actionRequiredOts;

    @Column(name = "action_required_mo")
    private Integer actionRequiredMo;


    @Column(name = "status_ots")
    private Integer statusOts;



    @Column(name = "status_mo")
    private Integer statusMo;


    @Column(name = "payment_date")
    private Date paymentDate;


    @Column(name = "payment_source")
    private Integer paymentSource;



    @Column(name = "in_dunning")
    private Integer inDunning;


    @Column(name = "interest_amt")
    private Integer interestAmt;



    @Column(name = "ots_file_id")
    private Integer otsFileId;

    @Column(name = "account_int_no")
    private Integer accountIntNo;


    @Column(name = "active_date")
    private Date activeDate;

    @Column(name = "currency_code")
    private Integer currencyCode;

    @Column(name = "ext_currency_code")
    private Integer extCurrencyCode;


    @Column(name = "tax_type_code")
    private Integer taxTypeCode;


    @Column(name = "external_id_type")
    private Integer externalIdType;


    @Column(name = "nrc_view_id")
    private Integer nrcViewId;


    @Column(name = "sms_send")
    private Integer smsSend;

    @Column(name = "start_period")
    private Date startPeriod;


    @Column(name = "contact_phone")
    private String contactPhone;


    @Column(name = "bill_period")
    private Integer billPeriod;



    @Column(name = "crm_payment_code")
    private Integer crmpaymentCode;


    @Column(name = "late_interest_amt")
    private Integer lateInterestAmt;



    @Column(name = "request_type")
    private Integer requestType;


    @Column(name = "dunning_action")
    private Integer dunningAction;

    @Column(name = "main_request_id")
    private Integer mainRequestId;



    @Column(name = "is_migrated")
    private Integer isMigrated;


    @Column(name = "invoce_tax_amount")
    private Integer invoceTaxAmount;


    @Column(name = "installment_number")
    private Integer installmentNumber;


    @Column(name = "payment_term")
    private Integer paymentTerm;


    @Column(name = "ths_action_id")
    private Integer thsActionId;


    @Column(name = "amount_elig_intfee")
    private Integer amountEligIntFee;


    @Column(name = "bill_title")
    private String billTitle;

    @Column(name = "ccb_due_date")
    private Date ccbDueDate;



    @Column(name = "inv_canc_status")
    private Integer invCancStatus;

    @Column(name = "original_due_amount")
    private Integer originalDueAmount;


    @Column(name = "inv_canc_date")
    private Date invCancDate;

    @Column(name = "mof_extr_status")
    private Integer mofExtrStatus;


    @Column(name = "iccb_dunning_status")
    private Integer iccbDunningStatus;


    @Column(name = "next_due_date")
    private Date nextDueDate;


    @Column(name = "instal_start_date")
    private Date instalStartDate;


    @Column(name = "instal_end_date")
    private Date instalEndDate;


    @Column(name = "user_id")
    private String userId;


}
