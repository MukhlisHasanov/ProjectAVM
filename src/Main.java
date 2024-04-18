import cinema.CinemaWareHouse;
import general.*;
import huperMarket.MarketOrder;
import huperMarket.WareHouse;

public class Main {
    public static void main(String[] args) {
        CinemaWareHouse cinemaHouse = new CinemaWareHouse();
        WareHouse warehouse= new WareHouse();
        ClientManagement clientManagement = new ClientManagement();
        Initializer initializer = new Initializer();
        initializer.initMarketProducts(warehouse);
        initializer.initClients(clientManagement);

        Product tv = new Product("Samsung 34", 800);
        Product laptop = new Product("Lenovo T590", 1000);
        Product bread = new Product("Bublik", 1.98f);
        Product meat = new Product("Beef", 6.50f);

        System.out.println(warehouse);
        warehouse.add("laptop", laptop, 10);
        System.out.println(warehouse);
        warehouse.add(new Product("Samsung 34", 800), 40);
        warehouse.add(2,20);
        System.out.println(warehouse);
        warehouse.add("food", bread, 100);
        warehouse.add("food", meat, 15);
        System.out.println(warehouse);
        warehouse.add("laptop", new Product("Lenovo T590", 1000), 15);
        warehouse.add("food", new Product("Bublik", 1.98f), 25);
        System.out.println(warehouse);
        // remove
        warehouse.delete(tv);
        System.out.println(warehouse);
        warehouse.add(laptop, 50);
        warehouse.add(3, 50);
        warehouse.add(4, 50);
        System.out.println(warehouse);
        warehouse.delete(3);
        System.out.println(warehouse);
        warehouse.add("tv", new Product("Samsung 34", 800), 150);
        System.out.println(warehouse);

        MarketOrder order = new MarketOrder(clientManagement.find(1));
        order.addBuyProduct(2, 15);
        order.addBuyProduct(4, 30);
        order.addBuyProduct(5,50);
        System.out.println(order);
        //warehouse.delOfOrder(order.getOrderList());
        System.out.println(warehouse);

    }
}