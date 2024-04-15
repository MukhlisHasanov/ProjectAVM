package general;

import huperMarket.Warehouse;

public class Initializer {

    public Warehouse initMarketProducts(Warehouse warehouse) {

        Product tv = new Product("Samsung 34", 800);
        Product laptop = new Product("Lenovo T590", 1000);
        Product bread = new Product("Bublik", 1.98f);
        Product meat = new Product("Beef", 6.50f);

        warehouse.add("tv", tv, 50);
        warehouse.add("laptop", laptop, 10);
        warehouse.add("food", bread, 100);
        warehouse.add("food", meat, 15);
        return warehouse;
    }

    public ClientManagement initClients(ClientManagement clientManagement) {
        clientManagement.add("Valerian", 38);
        clientManagement.add("Mukhlis", 25);
        clientManagement.add("Andrey", 50);
        clientManagement.add("Alexander", 56);
        return clientManagement;
    }
}
