package com.mohsen.megaventory.service;

import com.mohsen.megaventory.request.MegaventoryBaseRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class MegaventoryRequestResponse<T extends MegaventoryBaseRequest> {
    private final String EXTENDED_URL = "https://api.megaventory.com/v2017a/";

    public ResponseEntity<String> exchange(T t, String baseUrl) {
        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
        HttpEntity<T> httpEntity = new HttpEntity<>(t);
        String fullUrl = EXTENDED_URL + baseUrl;
        return restTemplate.postForEntity(fullUrl, httpEntity, String.class);
    }

}
