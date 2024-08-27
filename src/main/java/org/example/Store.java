package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Product> inventory;
    private final List<Cashiers> cashiers;

    public Store() {
        this.cashiers = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    // Add a new product to the store
    public void addProduct(Product product) {
        inventory.add(product);
    }

    public int getInventorySize() {
      return inventory.size();
    }

    // Sell a product by reducing its quantity
    public void sellProduct(String productName, int quantity) {
       for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(productName)) {
                if (product.getQuantity() >= quantity) {
                    product.updateQuantity(quantity);
                    System.out.println(quantity + " units of " + productName + " sold.");
                } else {
                    System.out.println("Not enough stock of " + productName + ".");
                }
                return;
            }
        }
        System.out.println("Product " + productName + " not found in store.");
    }

    // Display all products in the store
    public void displayInventory() {
        System.out.println("Store Inventory:");
        for (Product product : inventory) {
            System.out.println("Product: " + product.getName() +
                    ", Price: $" + product.getPrice() +
                    ", Quantity: " + product.getQuantity());
        }
    }

    public List<Cashiers> getCashiers() {
        return cashiers;
    }

    public void hireCashier(Cashiers cashier) {
        cashiers.add(cashier);
    }

    public void fireCashier(Cashiers cashier) {
        cashiers.remove(cashier);
    }
}
