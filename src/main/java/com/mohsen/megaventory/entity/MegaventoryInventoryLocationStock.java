package com.mohsen.megaventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MegaventoryInventoryLocationStock {
    @JsonProperty("ProductID")
    private long productId;

    @JsonProperty("ProductSKU")
    private String productSKU;

    @JsonProperty("ProductUnitCost")
    private double productUnitCost;

    @JsonProperty("ProductQuantity")
    private int productQuantity;

    @JsonProperty("InventoryLocationID")
    private long inventoryLocationId;

    public MegaventoryInventoryLocationStock(long productId, String productSKU, double productUnitCost, int productQuantity, long inventoryLocationId) {
        this.productId = productId;
        this.productSKU = productSKU;
        this.productUnitCost = productUnitCost;
        this.productQuantity = productQuantity;
        this.inventoryLocationId = inventoryLocationId;
    }

    public MegaventoryInventoryLocationStock() {
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public double getProductUnitCost() {
        return productUnitCost;
    }

    public void setProductUnitCost(double productUnitCost) {
        this.productUnitCost = productUnitCost;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public long getInventoryLocationId() {
        return inventoryLocationId;
    }

    public void setInventoryLocationId(long inventoryLocationId) {
        this.inventoryLocationId = inventoryLocationId;
    }
}
