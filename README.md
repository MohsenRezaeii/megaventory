## Project Documentation: Megaventory Integration

### Overview

This project focuses on developing a simple web application using Java that integrates with the Megaventory API. The application facilitates interactions with Megaventory entities such as Product, SupplierClient, and InventoryLocation. The goal is to perform operations like creating entities, establishing relationships, and updating product availability and cost.

### Project Structure

The project is organized into the following components:

1. **Entities:**
   - MegaventoryProduct: Represents a product with ID, SKU, description, sales price, purchase price, available units, and cost per unit.
   - MegaventorySupplierClient: Represents a client/supplier with ID, name, email, shipping address, type, and phone.
   - MegaventoryInventoryLocation: Represents an inventory location with name, abbreviation, and address.
   - MegaventoryInventoryLocationStock: Represents an inventory location stock with product ID, product SKU, product unit cost, product quantity, and inventory location ID
2. **Requests:**
   - MegaventoryBaseRequest: Represents a base request with API key and record action, inherited by all requests.
   - MegaventoryProductRequest: Represents a product request, with a MegaventoryProduct in addition to the parent base request.
   - MegaventorySupplierClientRequest: Represents a supplier/client request, with a MegaventorySupplierClient in addition to the parent base request.
   - MegaventoryInventoryLocationRequest: Represents an inventory location request, with a MegaventoryInventoryLocation in addition to the parent base request.
   - MegaventoryInventoryLocationStockRequest: Represents an inventory location stock request, with a MegaventoryInventoryLocationStock list in addition to the parent base request.
3. **Service Layer:**
   - MegaventoryService: Interface with methods to interact with the Megaventory API, including creating entities, establishing relationships, and updating availability and cost.
   - MegaventoryServiceImpl: Implementation of the MegaventoryService interface. It also reads the API key from the environment variables, as well as the record action ('Insert' or 'Update' or 'InsertOrUpdate' or 'InsertOrUpdateNonEmptyFields'), and uses this information in each request.
4. **Controller Layer:**
   - MegaventoryController: Exposes REST endpoints to perform operations such as creating entities, establishing relationships, and updating availability and cost.

### How to Use
**To run the project:** Run `docker compose up` from your command line (docker engine and docker compose are needed).

1. **Creating Products:**
   - Send a PUT request to localhost:8080/updateProduct?mvRecordAction=Insert with the following request body (values are examples):
```json
{
    "ProductSKU": "1112256",
    "ProductDescription": "Nike shoes",
    "ProductSellingPrice": 99.99,
    "ProductPurchasePrice": 44.99
}
```

2. **Creating Clients/Suppliers:**
   - Send a PUT request to localhost:8080/updateSupplierClient?mvRecordAction=Insert with the following request body (values are examples):
```json
{
   "SupplierClientName": "odysseus",
   "SupplierClientShippingAddress1": "Example 10, Athens ",
   "SupplierClientPhone1": "1235698988",
   "SupplierClientEmail": "odysseus@exampletest.com "
}
```
3. **Creating Inventory Locations:**
   - Send a PUT request to localhost:8080/updateInventoryLocation?mvRecordAction=Insert with the following request body (values are examples):
```json
{
   "InventoryLocationName": "Test Project Location",
   "InventoryLocationAbbreviation": "Test",
   "InventoryLocationAddress": "Example 20, Athens"
}
```
4. **Creating a relationship between a product and a supplier/client:**
   - Send a PUT request to localhost:8080/updateProduct?mvRecordAction=Update with the following request body (values are examples):
   - *NOTE*: Either `ProductID` or `ProductSKU` is enough for the request to succeed, but both can be provided too.
```json
{
   "ProductID": 40,
   "ProductSKU": "1112256",
   "ProductDescription": "Nike shoes",
   "ProductMainSupplierID": 7
}
```
5. **Updating product stock and cost in a given inventory location:**
   - Send a PUT request to localhost:8080/updateProductStock with the following request body (values are examples):
```json
[
   {
      "ProductID": 41,
      "ProductSKU": "1112248",
      "ProductUnitCost": 44.99,
      "ProductQuantity": 5,
      "InventoryLocationID": 3
   },
   {
      "ProductID": 40,
      "ProductSKU": "1112256",
      "ProductUnitCost": 44.99,
      "ProductQuantity": 5,
      "InventoryLocationID": 3
   }
]
```