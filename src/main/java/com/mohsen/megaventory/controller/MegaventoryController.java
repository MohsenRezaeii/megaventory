package com.mohsen.megaventory.controller;

import com.mohsen.megaventory.entity.MegaventoryInventoryLocation;
import com.mohsen.megaventory.entity.MegaventoryProduct;
import com.mohsen.megaventory.entity.MegaventorySupplierClient;
import com.mohsen.megaventory.service.MegaventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaventoryController {

    MegaventoryService megaventoryService;

    @Autowired
    public MegaventoryController(MegaventoryService megaventoryService) {
        this.megaventoryService = megaventoryService;
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<String> updateProduct(@RequestBody MegaventoryProduct product, @RequestParam String mvRecordAction) {
        return megaventoryService.updateProduct(product, mvRecordAction);
    }

    @PutMapping("/updateSupplierClient")
    public ResponseEntity<String> updateSupplierClient(@RequestBody MegaventorySupplierClient mvSupplierClient, @RequestParam String mvRecordAction) {
        return megaventoryService.updateSupplierClient(mvSupplierClient, mvRecordAction);
    }

    @PutMapping("/updateInventoryLocation")
    public ResponseEntity<String> updateInventoryLocation(@RequestBody MegaventoryInventoryLocation mvInventoryLocation, @RequestParam String mvRecordAction) {
        return megaventoryService.updateInventoryLocation(mvInventoryLocation, mvRecordAction);
    }
}
