package com.mohsen.megaventory.controller;

import com.mohsen.megaventory.entity.MegaventoryInventoryLocation;
import com.mohsen.megaventory.entity.MegaventoryProduct;
import com.mohsen.megaventory.entity.MegaventorySupplierClient;
import com.mohsen.megaventory.service.MegaventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaventoryController {

    MegaventoryService megaventoryService;

    @Autowired
    public MegaventoryController(MegaventoryService megaventoryService) {
        this.megaventoryService = megaventoryService;
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<String> updateProduct(@RequestBody MegaventoryProduct product) {
        return megaventoryService.updateProduct(product);
    }

    @PutMapping("/updateSupplierClient")
    public ResponseEntity<String> updateSupplierClient(@RequestBody MegaventorySupplierClient mvSupplierClient) {
        return megaventoryService.updateSupplierClient(mvSupplierClient);
    }

    @PutMapping("/updateInventoryLocation")
    public ResponseEntity<String> updateInventoryLocation(@RequestBody MegaventoryInventoryLocation mvInventoryLocation) {
        return megaventoryService.updateInventoryLocation(mvInventoryLocation);
    }
}
