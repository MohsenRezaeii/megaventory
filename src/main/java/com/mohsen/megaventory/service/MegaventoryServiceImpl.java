package com.mohsen.megaventory.service;

import com.mohsen.megaventory.entity.*;
import com.mohsen.megaventory.request.MegaventoryInventoryLocationRequest;
import com.mohsen.megaventory.request.MegaventoryInventoryLocationStockRequest;
import com.mohsen.megaventory.request.MegaventoryProductRequest;
import com.mohsen.megaventory.request.MegaventorySupplierClientRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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
        MegaventoryRequestResponse<MegaventoryProductRequest> requestResponse = new MegaventoryRequestResponse<>();
        return requestResponse.exchange(productRequest, "Product/ProductUpdate");
    }

    @Override
    public ResponseEntity<String> updateSupplierClient(MegaventorySupplierClient mvSupplierClient, String mvRecordAction) {
        MegaventorySupplierClientRequest supplierClientRequest = new MegaventorySupplierClientRequest();
        supplierClientRequest.setMvSupplierClient(mvSupplierClient);
        supplierClientRequest.setApiKey(apiKey);
        supplierClientRequest.setMvRecordAction(mvRecordAction);
        MegaventoryRequestResponse<MegaventorySupplierClientRequest> requestResponse = new MegaventoryRequestResponse<>();
        return requestResponse.exchange(supplierClientRequest, "SupplierClient/SupplierClientUpdate");
    }

    @Override
    public ResponseEntity<String> updateInventoryLocation(MegaventoryInventoryLocation mvInventoryLocation, String mvRecordAction) {
        MegaventoryInventoryLocationRequest inventoryLocationRequest = new MegaventoryInventoryLocationRequest();
        inventoryLocationRequest.setMvInventoryLocation(mvInventoryLocation);
        inventoryLocationRequest.setApiKey(apiKey);
        inventoryLocationRequest.setMvRecordAction(mvRecordAction);
        MegaventoryRequestResponse<MegaventoryInventoryLocationRequest> requestResponse = new MegaventoryRequestResponse<>();
        return requestResponse.exchange(inventoryLocationRequest, "InventoryLocation/InventoryLocationUpdate");
    }

    @Override
    public ResponseEntity<String> updateInventoryLocationStock(List<MegaventoryInventoryLocationStock> mvInventoryLocationStockList) {
        MegaventoryInventoryLocationStockRequest inventoryLocationStockRequest = new MegaventoryInventoryLocationStockRequest();
        inventoryLocationStockRequest.setProductStockUpdateList(mvInventoryLocationStockList);
        inventoryLocationStockRequest.setApiKey(apiKey);
        MegaventoryRequestResponse<MegaventoryInventoryLocationStockRequest> requestResponse = new MegaventoryRequestResponse<>();
        return requestResponse.exchange(inventoryLocationStockRequest, "InventoryLocationStock/ProductStockUpdate");
    }
}
