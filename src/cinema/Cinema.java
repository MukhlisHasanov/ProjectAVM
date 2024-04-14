package cinema;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/Cinema
 * @author Valerian & Andrey
 * @version 14-04-24
 */

import general.ClientManagement;
import general.Product;
import huperMarket.Order;

public class Cinema {
    public static void main(String[] args) {
        ClientManagement clientManagement = new ClientManagement();
        CinemaHouse cinemaHouse = new CinemaHouse();
        Order order = new Order(clientManagement.find(2));
        Product movie1 = new Product("Avatar", 50);
        Product movie2 = new Product("Back to the Future 3D", 70);
        cinemaHouse.add(1, movie1,"Fantasy", 200);
        cinemaHouse.add(2,movie2,"Fantasy",150);
        System.out.println(cinemaHouse);
        order.addBuyProduct(new CinemaProduct(1,movie1, "Fantasy", 5));
        order.addBuyProduct(new CinemaProduct(2,movie2,"Fantasy",1));
        System.out.println(order);
        cinemaHouse.delOfOrder(order.getShoppingList());
        System.out.println(cinemaHouse);

    }
}
