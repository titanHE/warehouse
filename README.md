# Warehouse
A user can add or remove products from the warehouse by calling the correct endpoints. All data is stored in a SQL database.

---

## API endpoints

1. POST /product/add - add a product to warehouse


2. DELETE /product/remove/{id} - remove product with given id


3. GET /system/status - returns a message 'status:UP'

---

For further details regarding config check the pom.xml and application.properties files.