package com.mohsen.megaventory.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class MegaventoryBaseRequest {
    @JsonProperty("APIKEY")
    private String apiKey;

    @JsonProperty("mvRecordAction")
    private String mvRecordAction;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }
}
