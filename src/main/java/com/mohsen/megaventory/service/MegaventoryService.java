package com.mohsen.megaventory.service;

import com.mohsen.megaventory.entity.MegaventoryProduct;
import com.mohsen.megaventory.entity.MegaventorySupplierClient;
import org.springframework.http.ResponseEntity;

public interface MegaventoryService {
    ResponseEntity<String> updateProduct(MegaventoryProduct product);

    ResponseEntity<String> updateSupplierClient(MegaventorySupplierClient mvSupplierClient);

}
