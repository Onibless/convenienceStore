package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello word");
        Customers mary = new Customers(1,"Mary", "John", "oni@john.com","0902100", "ketu 211",2222);
        System.out.println(mary);

        Staff staff = new Staff("hope",2,"09021830011" );
        System.out.println(staff);

        Store myStore = new Store();
        System.out.println(myStore);
        // Add products to the store
        myStore.addProduct(new Product("Laptop", 999.99, 10));
        System.out.println(myStore);
    }

}
