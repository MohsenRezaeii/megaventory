## Project Documentation: Megaventory Integration

### Overview

This project focuses on developing a simple web application using Java that integrates with the Megaventory API. The application facilitates interactions with Megaventory entities such as Product, SupplierClient, and InventoryLocation. The goal is to perform operations like creating entities, establishing relationships, and updating product availability and cost.

### Project Structure

The project is organized into the following components:

1. **Entities:**
   - Product: Represents a product with SKU, description, sales price, purchase price, available units, and cost per unit.
   - SupplierClient: Represents a client or supplier with name, email, shipping address, and phone.

2. **Service Layer:**
   - MegaventoryService: Contains methods to interact with the Megaventory API, including creating entities, establishing relationships, and updating availability and cost.

3. **Controller Layer:**
   - MegaventoryController: Exposes REST endpoints to perform operations such as creating entities, establishing relationships, and updating availability and cost.

### How to Use

1. **Creating Entities:**
   - Use the provided endpoints to create products, clients, suppliers, and inventory locations.
   - Example: `/api/megaventory/products/create`, `/api/megaventory/clients/create`, etc.

2. **Establishing Relationships:**
   - Create relationships between products and clients or suppliers.
   - Example: `/api/megaventory/relationships/create-product-client`, `/api/megaventory/relationships/create-product-supplier`, etc.

3. **Updating Availability and Cost:**
   - Update the availability and cost of products in the warehouse.
   - Example: `/api/megaventory/products/update-availability-and-cost`.

### Example Usage

#### Create a Product
