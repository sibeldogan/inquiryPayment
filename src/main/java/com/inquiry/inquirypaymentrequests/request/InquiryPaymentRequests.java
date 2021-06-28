package com.inquiry.inquirypaymentrequests.request;

import javax.validation.constraints.NotNull;
import java.util.Date;


public class InquiryPaymentRequests {

    private InquiryLocateData inquiryLocateData;

    private boolean lastInvoiceFlag;

    private Date periodStartDate;

    private Date periodEndDate;

    private Integer paymentStatusDesc;

    @NotNull
    private Integer invoiceTypeId;
    private Integer paymentDesc;
    private Integer invoiceStatusReq;
    //private List<Integer> invoiceStatusReqList;
    private Integer invoiceStatusReqList;
    private Date invoiceDueDate;
    private boolean inYTS;


    public InquiryLocateData getInquiryLocateData() {
        return inquiryLocateData;
    }

    public void setInquiryLocateData(InquiryLocateData inquiryLocateData) {
        this.inquiryLocateData = inquiryLocateData;
    }

    public boolean isLastInvoiceFlag() {
        return lastInvoiceFlag;
    }

    public void setLastInvoiceFlag(boolean lastInvoiceFlag) {
        this.lastInvoiceFlag = lastInvoiceFlag;
    }

    public Date getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(Date periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public Date getPeriodEndDate() {
        return periodEndDate;
    }

    public void setPeriodEndDate(Date periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public Integer getPaymentStatusDesc() {
        return paymentStatusDesc;
    }

    public void setPaymentStatusDesc(Integer paymentStatusDesc) {
        this.paymentStatusDesc = paymentStatusDesc;
    }

    public Integer getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(Integer invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public Integer getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(Integer paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    public Integer getInvoiceStatusReq() {
        return invoiceStatusReq;
    }

    public void setInvoiceStatusReq(Integer invoiceStatusReq) {
        this.invoiceStatusReq = invoiceStatusReq;
    }

    public Integer getInvoiceStatusReqList() {
        return invoiceStatusReqList;
    }

    public void setInvoiceStatusReqList(Integer invoiceStatusReqList) {
        this.invoiceStatusReqList = invoiceStatusReqList;
    }

    public Date getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Date invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public boolean isInYTS() {
        return inYTS;
    }

    public void setInYTS(boolean inYTS) {
        this.inYTS = inYTS;
    }
}




