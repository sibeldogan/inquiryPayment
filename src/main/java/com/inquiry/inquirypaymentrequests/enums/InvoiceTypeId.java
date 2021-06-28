package com.inquiry.inquirypaymentrequests.enums;

public enum  InvoiceTypeId {

    NORMAL_PAYMENT(0,"Standart"),
    INTERIN_PAYMENT(1,"Interim"),
    ADVANCE_PAYMENT(2,"Advance");

    private final int requestType;
    private final String description;

    public String getDescription() {
        return description;
    }

    public int getRequestType() {
        return requestType;
    }

    InvoiceTypeId(int requestType, String description) {
        this.requestType = requestType;
        this.description = description;
    }
}
