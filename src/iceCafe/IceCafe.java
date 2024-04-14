package iceCafe;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/IceCoffee
 * @author Valerian
 * @version 14-04-24
 */


import general.ClientManagement;
import general.Product;
import huperMarket.Order;

public class IceCafe {
    public static void main(String[] args) {
        ClientManagement clientManagement = new ClientManagement();
        IceHouse iceHouse = new IceHouse();
        Order order = new Order(clientManagement.find(3));
        Product Ice1 = new Product("chocolate", 3);
        Product Ice2 = new Product("strawberry with chocolate", 5);
        Product Cafe = new Product("latte macchiato", 3);
        iceHouse.add(1, Ice1,"chocolate", 30);
        iceHouse.add(2,Ice2,"strawberry with chocolate",30);
        iceHouse.add(3,Cafe,"latte macchiato",30);
        System.out.println(iceHouse);
        order.addBuyProduct(new IceProduct(1,Ice1, "Fantasy", 5));
        order.addBuyProduct(new IceProduct(2,Ice2,"Fantasy",1));
        order.addBuyProduct(new IceProduct(3,Cafe,"Cafe",1));
        System.out.println(order);
        iceHouse.delOfOrder(order.getShoppingList());
        System.out.println(iceHouse);

    }
}
