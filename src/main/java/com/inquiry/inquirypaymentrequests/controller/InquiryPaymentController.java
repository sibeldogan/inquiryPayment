package com.inquiry.inquirypaymentrequests.controller;

import com.inquiry.inquirypaymentrequests.request.BillingAccount;
import com.inquiry.inquirypaymentrequests.request.InquiryPaymentRequests;
import com.inquiry.inquirypaymentrequests.response.InquiryPaymentRequestsResponse;
import com.inquiry.inquirypaymentrequests.response.ServerInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/payment")
public class InquiryPaymentController {

    @Autowired
    private Environment environment;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping()
    public InquiryPaymentRequestsResponse  inquiryPayment(
            @Valid @RequestBody InquiryPaymentRequests requests) {

        BillingAccount billingAccount = requests.getInquiryLocateData().getBillingAccountIdList().get(0);
        String externalId = billingAccount.getExternalId();
        int externalIdType = billingAccount.getExternalIdType();

        switch (externalIdType){

            case 1:
                String url = environment.getProperty("locater.service.url1");

                ResponseEntity<ServerInformation> response
                        = restTemplate.getForEntity(url + "?custExternalId="+externalId, ServerInformation.class);
                ServerInformation serverInformation = response.getBody();
         }
        return new InquiryPaymentRequestsResponse();
    }
}
