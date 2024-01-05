package com.mohsen.megaventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MegaventorySupplierClient {
    @JsonProperty("SupplierClientType")
    private String supplierClientType;

    @JsonProperty("SupplierClientName")
    private String supplierClientName;

    @JsonProperty("SupplierClientShippingAddress1")
    private String supplierClientShippingAddress1;

    @JsonProperty("SupplierClientPhone1")
    private String supplierClientPhone1;

    @JsonProperty("SupplierClientEmail")
    private String supplierClientEmail;

    public MegaventorySupplierClient(String supplierClientType, String supplierClientName, String supplierClientShippingAddress1, String supplierClientPhone1, String supplierClientEmail) {
        this.supplierClientType = supplierClientType;
        this.supplierClientName = supplierClientName;
        this.supplierClientShippingAddress1 = supplierClientShippingAddress1;
        this.supplierClientPhone1 = supplierClientPhone1;
        this.supplierClientEmail = supplierClientEmail;
    }

    public String getSupplierClientType() {
        return supplierClientType;
    }

    public void setSupplierClientType(String supplierClientType) {
        this.supplierClientType = supplierClientType;
    }

    public String getSupplierClientName() {
        return supplierClientName;
    }

    public void setSupplierClientName(String supplierClientName) {
        this.supplierClientName = supplierClientName;
    }

    public String getSupplierClientShippingAddress1() {
        return supplierClientShippingAddress1;
    }

    public void setSupplierClientShippingAddress1(String supplierClientShippingAddress1) {
        this.supplierClientShippingAddress1 = supplierClientShippingAddress1;
    }

    public String getSupplierClientPhone1() {
        return supplierClientPhone1;
    }

    public void setSupplierClientPhone1(String supplierClientPhone1) {
        this.supplierClientPhone1 = supplierClientPhone1;
    }

    public String getSupplierClientEmail() {
        return supplierClientEmail;
    }

    public void setSupplierClientEmail(String supplierClientEmail) {
        this.supplierClientEmail = supplierClientEmail;
    }
}
