package com.mohsen.megaventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MegaventoryInventoryLocationRequest {

    @JsonProperty("APIKEY")
    private String apiKey;
    @JsonProperty("mvInventoryLocation")
    private MegaventoryInventoryLocation mvInventoryLocation;
    @JsonProperty("mvRecordAction")
    private String mvRecordAction;

    public MegaventoryInventoryLocationRequest() {
    }

    public MegaventoryInventoryLocationRequest(String apiKey, MegaventoryInventoryLocation mvInventoryLocation, String mvRecordAction) {
        this.apiKey = apiKey;
        this.mvInventoryLocation = mvInventoryLocation;
        this.mvRecordAction = mvRecordAction;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public MegaventoryInventoryLocation getMvInventoryLocation() {
        return mvInventoryLocation;
    }

    public void setMvInventoryLocation(MegaventoryInventoryLocation mvInventoryLocation) {
        this.mvInventoryLocation = mvInventoryLocation;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }

}
