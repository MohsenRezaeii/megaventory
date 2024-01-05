package com.mohsen.megaventory.service;

import com.mohsen.megaventory.entity.MegaventoryProduct;
import com.mohsen.megaventory.entity.MegaventoryProductRequest;
import com.mohsen.megaventory.entity.MegaventorySupplierClient;
import com.mohsen.megaventory.entity.MegaventorySupplierClientRequest;
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
    public ResponseEntity<String> updateProduct(MegaventoryProduct product) {

        MegaventoryProductRequest productRequest = new MegaventoryProductRequest();
        productRequest.setMvProduct(product);
        productRequest.setApiKey(apiKey);
        productRequest.setMvRecordAction("Insert");

        HttpEntity<MegaventoryProductRequest> requestEntity = new HttpEntity<>(productRequest);

        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        String megaventoryApiUrl = "https://api.megaventory.com/v2017a/Product/ProductUpdate";

        return restTemplate.postForEntity(megaventoryApiUrl, requestEntity, String.class);
    }

    @Override
    public ResponseEntity<String> updateSupplierClient(MegaventorySupplierClient mvSupplierClient) {
        MegaventorySupplierClientRequest supplierClientRequest = new MegaventorySupplierClientRequest();
        supplierClientRequest.setMvSupplierClient(mvSupplierClient);
        supplierClientRequest.setApiKey(apiKey);
        supplierClientRequest.setMvRecordAction("Insert");
        HttpEntity<MegaventorySupplierClientRequest> requestEntity = new HttpEntity<>(supplierClientRequest);

        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        String megaventoryApiUrl = "https://api.megaventory.com/v2017a/SupplierClient/SupplierClientUpdate";

        return restTemplate.postForEntity(megaventoryApiUrl, requestEntity, String.class);
    }
}
