package com.mohsen.megaventory.controller;

import com.mohsen.megaventory.service.MegaventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaventoryController {

    MegaventoryService megaventoryService;

    @Autowired
    public MegaventoryController(MegaventoryService megaventoryService) {
        this.megaventoryService = megaventoryService;
    }

    @GetMapping("/getProducts")
    public ResponseEntity<String> sampleGet() {
        return megaventoryService.getProducts();
    }

}
