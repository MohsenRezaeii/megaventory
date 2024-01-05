package com.mohsen.megaventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MegaventoryInventoryLocation {
    @JsonProperty("InventoryLocationName")
    private String inventoryLocationName;

    @JsonProperty("InventoryLocationAbbreviation")
    private String inventoryLocationAbbreviation;

    @JsonProperty("InventoryLocationAddress")
    private String inventoryLocationAddress;

    public MegaventoryInventoryLocation(String inventoryLocationName, String inventoryLocationAbbreviation, String inventoryLocationAddress) {
        this.inventoryLocationName = inventoryLocationName;
        this.inventoryLocationAbbreviation = inventoryLocationAbbreviation;
        this.inventoryLocationAddress = inventoryLocationAddress;
    }

    public String getInventoryLocationName() {
        return inventoryLocationName;
    }

    public void setInventoryLocationName(String inventoryLocationName) {
        this.inventoryLocationName = inventoryLocationName;
    }

    public String getInventoryLocationAbbreviation() {
        return inventoryLocationAbbreviation;
    }

    public void setInventoryLocationAbbreviation(String inventoryLocationAbbreviation) {
        this.inventoryLocationAbbreviation = inventoryLocationAbbreviation;
    }

    public String getInventoryLocationAddress() {
        return inventoryLocationAddress;
    }

    public void setInventoryLocationAddress(String inventoryLocationAddress) {
        this.inventoryLocationAddress = inventoryLocationAddress;
    }
}
