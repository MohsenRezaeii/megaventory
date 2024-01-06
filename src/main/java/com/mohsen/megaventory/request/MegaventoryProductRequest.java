package com.mohsen.megaventory.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mohsen.megaventory.entity.MegaventoryProduct;

public class MegaventoryProductRequest extends MegaventoryBaseRequest {

    @JsonProperty("mvProduct")
    private MegaventoryProduct mvProduct;

    public MegaventoryProductRequest(MegaventoryProduct mvProduct) {
        this.mvProduct = mvProduct;
    }

    public MegaventoryProductRequest() {
    }

    public MegaventoryProduct getMvProduct() {
        return mvProduct;
    }

    public void setMvProduct(MegaventoryProduct mvProduct) {
        this.mvProduct = mvProduct;
    }

}
