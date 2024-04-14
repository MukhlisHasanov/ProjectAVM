package clothShop;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/ClothShop
 * @author Valerian
 * @version 14-04-24
 */

import general.ClientManagement;
import general.Product;
import huperMarket.Order;

public class ClothShop {
    public static void main(String[] args) {
        ClientManagement clientManagement = new ClientManagement();
        ClothShopHouse clothShopHouse = new ClothShopHouse();
        Order order = new Order(clientManagement.find(4));
        Product jacket = new Product("Esprit", 500);
        Product trousers = new Product("Jeans", 90);
        clothShopHouse.add(1, jacket,"Jacket", 30);
        clothShopHouse.add(2,trousers,"Trousers",50);

        System.out.println(clothShopHouse);
        order.addBuyProduct(new ClothProduct( 1,jacket,"Jacket",1));
        order.addBuyProduct(new ClothProduct(2,trousers,"Trousers",1));
        System.out.println(order);
        clothShopHouse.delOfOrder(order.getShoppingList());
        System.out.println(clothShopHouse);

    }
}