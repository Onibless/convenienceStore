package org.example;




import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreTest {

    private Store store;

    @Test
    public void sellProduct() {
        Product vans = new Product("Vans", 50.00, 10);
        Product fan = new Product("Fan", 40.00, 10);
        Product chair = new Product("Chair", 100.00, 10);

        store = new Store();
        store.addProduct(vans);
        store.addProduct(fan);
        store.addProduct(chair);

        Assert.assertEquals(3, store.getInventorySize());

        store.sellProduct("Vans", 5);
        store.sellProduct("Vans", 5);

        Assert.assertEquals(0, vans.getQuantity());


    }

}