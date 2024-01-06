package com.mohsen.megaventory.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mohsen.megaventory.entity.MegaventoryInventoryLocation;

public class MegaventoryInventoryLocationRequest extends MegaventoryBaseRequest {

    @JsonProperty("mvInventoryLocation")
    private MegaventoryInventoryLocation mvInventoryLocation;

    public MegaventoryInventoryLocationRequest() {
    }

    public MegaventoryInventoryLocationRequest(MegaventoryInventoryLocation mvInventoryLocation) {
        this.mvInventoryLocation = mvInventoryLocation;
    }


    public MegaventoryInventoryLocation getMvInventoryLocation() {
        return mvInventoryLocation;
    }

    public void setMvInventoryLocation(MegaventoryInventoryLocation mvInventoryLocation) {
        this.mvInventoryLocation = mvInventoryLocation;
    }

}
