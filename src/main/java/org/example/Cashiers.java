package org.example;


public class Cashiers extends Staff  {

    public Cashiers(String name,int id,String phoneNumber){
        super(name, id , phoneNumber);
    }

    public void sellProduct (Product product, Customers customers, int quantity){
        if(product.getQuantity() >= quantity){
            double totalCost = product.getPrice() * quantity;
            customers.setBalance(customers.getBalance() - totalCost);
            product.updateQuantity(quantity);
        }
    }

}
