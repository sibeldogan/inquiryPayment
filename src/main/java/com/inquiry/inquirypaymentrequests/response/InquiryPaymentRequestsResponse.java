package com.inquiry.inquirypaymentrequests.response;

import lombok.Data;

import java.util.List;

@Data
public class InquiryPaymentRequestsResponse {

    private List<InquiryPaymentRequestsDetailData> inquiryPaymentRequestsDetailDataList;
}