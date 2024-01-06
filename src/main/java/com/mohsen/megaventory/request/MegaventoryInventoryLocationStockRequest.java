package com.mohsen.megaventory.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mohsen.megaventory.entity.MegaventoryInventoryLocationStock;

import java.util.List;

public class MegaventoryInventoryLocationStockRequest extends MegaventoryBaseRequest {
    @JsonProperty("mvProductStockUpdateList")
    private List<MegaventoryInventoryLocationStock> productStockUpdateList;

    public MegaventoryInventoryLocationStockRequest(List<MegaventoryInventoryLocationStock> productStockUpdateList) {
        this.productStockUpdateList = productStockUpdateList;
    }

    public MegaventoryInventoryLocationStockRequest() {
    }

    public List<MegaventoryInventoryLocationStock> getProductStockUpdateList() {
        return productStockUpdateList;
    }

    public void setProductStockUpdateList(List<MegaventoryInventoryLocationStock> productStockUpdateList) {
        this.productStockUpdateList = productStockUpdateList;
    }
}
