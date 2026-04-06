# Smart Warehouse Management System (SWMS)

A robust, CLI-based Java application designed to manage diverse inventory types using core **Object-Oriented Programming (OOP)** principles. This project simulates a real-world backend system for tracking products, handling supplier logic, and enforcing business rules through custom exception handling.

## 🚀 Technical Highlights

This project serves as a comprehensive implementation of the following Java concepts:
* **Abstraction & Inheritance:** Base `Product` class with specialized `Electronics` and `Perishable` subclasses.
* **Polymorphism:** Utilizing **Dynamic Method Dispatch** to calculate specific pricing and discounts at runtime.
* **Interfaces:** Implementation of a `Shippable` contract to separate shipping logic from core product data.
* **Collections Framework:** Using `HashMap<String, Product>` for $O(1)$ search efficiency and data management.
* **Custom Exception Handling:** Robust error management using a `try-catch-finally` architecture to prevent system crashes.

---

## 🏗️ Architecture & Design

### Class Hierarchy
The system is built on a "Contract-First" design approach:

1.  **Model Layer:**
    * `Product` (Abstract): Defines the blueprint for all inventory items.
    * `Electronics`: Handles warranty logic and implements `Shippable`.
    * `Perishable`: Manages expiration dates and dynamic spoilage discounts.
2.  **Service Layer:**
    * `InventoryManager`: The controller that handles the logic for adding, removing, and searching items.
3.  **Exception Layer:**
    * `InsufficientStockException`: Thrown when a withdrawal exceeds available quantity.
    * `ProductNotFoundException`: Thrown when an invalid SKU is entered.

---

## 🛠️ Features

* **Real-time Inventory Tracking:** Add, update, and remove products with instant memory updates.
* **Business Rule Validation:** Prevents negative stock levels and invalid price entries.
* **Low Stock Alerts:** Automatic notification system when item counts fall below a specific threshold (e.g., < 5 units).
* **Polymorphic Reporting:** Generate a full warehouse report where each item displays its unique properties (e.g., warranty for tech, expiry for food) via method overriding.

---

## 💻 How to Run

1.  **Prerequisites:** Ensure you have JDK 11 or higher installed.
2.  **Clone the Repository:**
    ```bash
    git clone https://github.com/yourusername/smart-warehouse-system.git
    ```
3.  **Compile:**
    ```bash
    javac com/warehouse/main/Main.java
    ```
4.  **Execute:**
    ```bash
    java com.warehouse.main.Main
    ```

---

## 📈 Future Roadmap
- [ ] **Data Persistence:** Integrate File I/O to save/load inventory from a `.csv` file.
- [ ] **Search Filters:** Add the ability to filter products by category or price range using Java Streams.
- [ ] **Multi-Warehouse Support:** Expand the `Map` structure to handle multiple locations.

---
**Author:** Anonymuscoder

**Role:** Junior Java Developer Portfolio Project