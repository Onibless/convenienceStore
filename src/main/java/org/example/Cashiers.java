package org.example;




public class Cashiers extends Staff  {
    public Cashiers(String name,int id,String phoneNumber){
        super(name, id , phoneNumber);
    }
    public void sellProduct (Products products, Customers customers, int quantity){
        if(products.getQuantity() >= quantity){
            double totalCost = products.getPrice() * quantity;
            customers.setBalance(customers.getBalance() - totalCost);
            products.updateQuantity(quantity);
        }
    }


    public void add(Cashiers cashiers) {
    }

    public void remove(Cashiers cashiers) {
    }
}
