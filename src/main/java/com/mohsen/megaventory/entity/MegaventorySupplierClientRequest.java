package com.mohsen.megaventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MegaventorySupplierClientRequest {

    @JsonProperty("APIKEY")
    private String apiKey;
    @JsonProperty("mvSupplierClient")
    private MegaventorySupplierClient mvSupplierClient;
    @JsonProperty("mvRecordAction")
    private String mvRecordAction;

    public MegaventorySupplierClientRequest() {
    }

    public MegaventorySupplierClientRequest(String apiKey, MegaventorySupplierClient mvSupplierClient, String mvRecordAction) {
        this.apiKey = apiKey;
        this.mvSupplierClient = mvSupplierClient;
        this.mvRecordAction = mvRecordAction;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public MegaventorySupplierClient getMvSupplierClient() {
        return mvSupplierClient;
    }

    public void setMvSupplierClient(MegaventorySupplierClient mvSupplierClient) {
        this.mvSupplierClient = mvSupplierClient;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }
}
