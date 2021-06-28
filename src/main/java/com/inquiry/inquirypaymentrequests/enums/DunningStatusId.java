package com.inquiry.inquirypaymentrequests.enums;

public enum DunningStatusId {

    NOT_IN_DUNNING(0,"Not In Dunning"),
    IN_DUNNING(1,"In Dunning"),
    PAID_DURING_DUNNING(2,"Paid During Dunning"),
    AFTER_LAST_STEP_OF_DUNNING(3,"After Last Step of Dunning"),
    REMOVED_DURING_DUNNING(4,"Removed During Dunning"),
    IN_YTS_PAID(5,"In YTS Paid"),
    PAID_DURING_YTS(6,"Paid during YTS");


    private final int dunningStatusId;
    private final String description;


    DunningStatusId(int dunningStatusId, String description) {
        this.dunningStatusId = dunningStatusId;
        this.description = description;
    }
}
