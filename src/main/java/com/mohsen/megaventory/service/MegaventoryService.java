package com.mohsen.megaventory.service;

import com.mohsen.megaventory.entity.MegaventoryProduct;
import org.springframework.http.ResponseEntity;

public interface MegaventoryService {
    ResponseEntity<String> updateProduct(MegaventoryProduct product);

}
