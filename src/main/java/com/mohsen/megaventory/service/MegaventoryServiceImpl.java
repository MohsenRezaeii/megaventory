package com.mohsen.megaventory.service;

import com.mohsen.megaventory.entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MegaventoryServiceImpl implements MegaventoryService {

    @Value("${MEGAVENTORY_API_KEY}")
    private String apiKey;

    @Override
    public ResponseEntity<String> updateProduct(MegaventoryProduct product, String mvRecordAction) {

        MegaventoryProductRequest productRequest = new MegaventoryProductRequest();
        productRequest.setMvProduct(product);
        productRequest.setApiKey(apiKey);
        productRequest.setMvRecordAction(mvRecordAction);

        HttpEntity<MegaventoryProductRequest> requestEntity = new HttpEntity<>(productRequest);

        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        String megaventoryApiUrl = "https://api.megaventory.com/v2017a/Product/ProductUpdate";

        return restTemplate.postForEntity(megaventoryApiUrl, requestEntity, String.class);
    }

    @Override
    public ResponseEntity<String> updateSupplierClient(MegaventorySupplierClient mvSupplierClient, String mvRecordAction) {
        MegaventorySupplierClientRequest supplierClientRequest = new MegaventorySupplierClientRequest();
        supplierClientRequest.setMvSupplierClient(mvSupplierClient);
        supplierClientRequest.setApiKey(apiKey);
        supplierClientRequest.setMvRecordAction(mvRecordAction);
        HttpEntity<MegaventorySupplierClientRequest> requestEntity = new HttpEntity<>(supplierClientRequest);

        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        String megaventoryApiUrl = "https://api.megaventory.com/v2017a/SupplierClient/SupplierClientUpdate";

        return restTemplate.postForEntity(megaventoryApiUrl, requestEntity, String.class);
    }

    @Override
    public ResponseEntity<String> updateInventoryLocation(MegaventoryInventoryLocation mvInventoryLocation, String mvRecordAction) {
        MegaventoryInventoryLocationRequest inventoryLocationRequest = new MegaventoryInventoryLocationRequest();
        inventoryLocationRequest.setMvInventoryLocation(mvInventoryLocation);
        inventoryLocationRequest.setApiKey(apiKey);
        inventoryLocationRequest.setMvRecordAction(mvRecordAction);

        HttpEntity<MegaventoryInventoryLocationRequest> requestEntity = new HttpEntity<>(inventoryLocationRequest);

        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        String megaventoryApiUrl = "https://api.megaventory.com/v2017a/InventoryLocation/InventoryLocationUpdate";

        return restTemplate.postForEntity(megaventoryApiUrl, requestEntity, String.class);
    }
}
