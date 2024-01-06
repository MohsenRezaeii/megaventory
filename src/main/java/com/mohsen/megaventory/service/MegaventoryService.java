package com.mohsen.megaventory.service;

import com.mohsen.megaventory.entity.MegaventoryInventoryLocation;
import com.mohsen.megaventory.entity.MegaventoryInventoryLocationStock;
import com.mohsen.megaventory.entity.MegaventoryProduct;
import com.mohsen.megaventory.entity.MegaventorySupplierClient;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MegaventoryService {
    ResponseEntity<String> updateProduct(MegaventoryProduct product, String mvRecordAction);

    ResponseEntity<String> updateSupplierClient(MegaventorySupplierClient mvSupplierClient, String mvRecordAction);

    ResponseEntity<String> updateInventoryLocation(MegaventoryInventoryLocation mvInventoryLocation, String mvRecordAction);

    ResponseEntity<String> updateInventoryLocationStock(List<MegaventoryInventoryLocationStock> mvInventoryLocationStockList);

}
