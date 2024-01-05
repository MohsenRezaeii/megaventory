package com.mohsen.megaventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MegaventoryProductRequest {

    @JsonProperty("APIKEY")
    private String apiKey;
    @JsonProperty("mvProduct")
    private MegaventoryProduct mvProduct;
    @JsonProperty("mvRecordAction")
    private String mvRecordAction;

    public MegaventoryProductRequest(String APIKEY, MegaventoryProduct mvProduct, String mvRecordAction) {
        this.apiKey = APIKEY;
        this.mvProduct = mvProduct;
        this.mvRecordAction = mvRecordAction;
    }

    public MegaventoryProductRequest() {
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public MegaventoryProduct getMvProduct() {
        return mvProduct;
    }

    public void setMvProduct(MegaventoryProduct mvProduct) {
        this.mvProduct = mvProduct;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }

}
