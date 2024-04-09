import cinema.CinemaHouse;
import general.Client;
import general.Product;
import huperMarket.MarketProduct;
import huperMarket.Order;
import huperMarket.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>(List.of(
                new Client("V", 1, 10),
                new Client("M", 2, 9),
                new Client("A", 3, 11),
                new Client("A", 4, 14)));

        Product tv = new Product("Samsung 34'", 800);
        Product laptop = new Product("Lenovo T590", 1000);
        Product bread = new Product("Bublik", 1.98f);
        Product meat = new Product("Beef", 6.50f);

        CinemaHouse cinemaHouse = new CinemaHouse();
        Warehouse warehouse= new Warehouse();
        warehouse.add(1, tv, "household", 50);
        warehouse.add(2, laptop, "computer", 10);
        System.out.println(warehouse);
        warehouse.add(1, tv, "household", 40);
        System.out.println(warehouse);
        warehouse.add(3, bread, "food", 100);
        warehouse.add(4, meat, "food", 15);
        System.out.println(warehouse);
        warehouse.add(2, laptop, "computer", 15);
        warehouse.add(3, bread, "food", 25);
        System.out.println(warehouse);
        // remove
        warehouse.del(tv);
        System.out.println(warehouse);
        warehouse.add(laptop, 50);
        warehouse.add(3, 50);
        warehouse.add(4, 50);
        System.out.println(warehouse);
        warehouse.del(3);
        System.out.println(warehouse);

        List<Order> orders = new ArrayList<>();
        Order order = new Order(clients.get(1));
        order.addBayProduct(new MarketProduct(2, laptop, "computer", 10));
        order.addBayProduct(new MarketProduct(4, meat, "food", 15));
        System.out.println(order);
        warehouse.delOfOrder(order.getShoppingList());
        System.out.println(warehouse);
    }
}