package com.mohsen.megaventory.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MegaventoryServiceImpl implements MegaventoryService {

    @Value("${MEGAVENTORY_API_KEY}")
    private String apiKey;
    @Override
    public ResponseEntity<String> getProducts() {
        String url = "https://api.megaventory.com/v2017a/json/reply/ProductGet";
        String requestBody = "{\"APIKEY\":\"" + apiKey + "\"}";
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(
                url,
                requestEntity,
                String.class
        );
        if (response.getStatusCode().is2xxSuccessful()) {
            return response;
        } else {
            return new ResponseEntity<>(response.getStatusCode());
        }
    }
}
