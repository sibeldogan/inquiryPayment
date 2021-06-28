package com.inquiry.inquirypaymentrequests.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingAccount {

    private String externalId;

    private int externalIdType;

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public int getExternalIdType() {
        return externalIdType;
    }

    public void setExternalIdType(int externalIdType) {
        this.externalIdType = externalIdType;
    }
}
