package com.inquiry.inquirypaymentrequests.request;

import java.util.List;

public class InquiryLocateData {

    private List<BillingAccount> billingAccountIdList;

    public List<BillingAccount> getBillingAccountIdList() {
        return billingAccountIdList;
    }

    public void setBillingAccountIdList(List<BillingAccount> billingAccountIdList) {
        this.billingAccountIdList = billingAccountIdList;
    }
}
