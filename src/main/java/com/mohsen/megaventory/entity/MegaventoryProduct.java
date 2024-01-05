package com.mohsen.megaventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MegaventoryProduct {

    @JsonProperty("ProductSKU")
    private String productSKU;

    @JsonProperty("ProductDescription")
    private String productDescription;

    @JsonProperty("ProductSellingPrice")
    private double productSellingPrice;

    @JsonProperty("ProductPurchasePrice")
    private double productPurchasePrice;

    public MegaventoryProduct(String productSKU, String productDescription, double productSellingPrice, double productPurchasePrice) {
        this.productSKU = productSKU;
        this.productDescription = productDescription;
        this.productSellingPrice = productSellingPrice;
        this.productPurchasePrice = productPurchasePrice;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(double productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }

    public double getProductPurchasePrice() {
        return productPurchasePrice;
    }

    public void setProductPurchasePrice(double productPurchasePrice) {
        this.productPurchasePrice = productPurchasePrice;
    }

}
