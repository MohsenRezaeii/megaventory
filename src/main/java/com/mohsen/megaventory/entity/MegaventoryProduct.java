package com.mohsen.megaventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MegaventoryProduct {

    @JsonProperty("ProductID")
    private long productID;
    @JsonProperty("ProductSKU")
    private String productSKU;

    @JsonProperty("ProductDescription")
    private String productDescription;

    @JsonProperty("ProductSellingPrice")
    private double productSellingPrice;

    @JsonProperty("ProductPurchasePrice")
    private double productPurchasePrice;

    @JsonProperty("ProductMainSupplierID")
    private long productMainSupplierID;

    public MegaventoryProduct(long productID, String productSKU, String productDescription, double productSellingPrice, double productPurchasePrice, long productMainSupplierID) {
        this.productID = productID;
        this.productSKU = productSKU;
        this.productDescription = productDescription;
        this.productSellingPrice = productSellingPrice;
        this.productPurchasePrice = productPurchasePrice;
        this.productMainSupplierID = productMainSupplierID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
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

    public long getProductMainSupplierID() {
        return productMainSupplierID;
    }

    public void setProductMainSupplierID(long productMainSupplierID) {
        this.productMainSupplierID = productMainSupplierID;
    }
}
