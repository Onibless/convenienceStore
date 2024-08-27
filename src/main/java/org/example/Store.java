package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Products> inventory;

    public Store() {
        this.inventory = new ArrayList<>();
    }

    // Add a new product to the store
    public void addProduct(Products product) {
        inventory.add(product);
    }

    // Sell a product by reducing its quantity
    public void sellProduct(String productName, int quantity) {
        for (Products product : inventory) {
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
        for (Products product : inventory) {
            System.out.println("Product: " + product.getName() +
                    ", Price: $" + product.getPrice() +
                    ", Quantity: " + product.getQuantity());
        }
    }
}
