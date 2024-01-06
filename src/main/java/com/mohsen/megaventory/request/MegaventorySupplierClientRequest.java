package com.mohsen.megaventory.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mohsen.megaventory.entity.MegaventorySupplierClient;

public class MegaventorySupplierClientRequest extends MegaventoryBaseRequest {

    @JsonProperty("mvSupplierClient")
    private MegaventorySupplierClient mvSupplierClient;

    public MegaventorySupplierClientRequest() {
    }

    public MegaventorySupplierClientRequest(MegaventorySupplierClient mvSupplierClient) {
        this.mvSupplierClient = mvSupplierClient;
    }

    public MegaventorySupplierClient getMvSupplierClient() {
        return mvSupplierClient;
    }

    public void setMvSupplierClient(MegaventorySupplierClient mvSupplierClient) {
        this.mvSupplierClient = mvSupplierClient;
    }

}
