package com.mohsen.megaventory.service;

import org.springframework.http.ResponseEntity;

public interface MegaventoryService {

    ResponseEntity<String> getProducts();

}
