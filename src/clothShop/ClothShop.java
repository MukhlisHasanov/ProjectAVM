package clothShop;

import general.ClientManagement;
import general.Product;
import huperMarket.MarketOrder;

public class ClothShop {
    public static void main(String[] args) {
        ClientManagement clientManagement = new ClientManagement();
        ClothShopHouse clothShopHouse = new ClothShopHouse();
        MarketOrder order = new MarketOrder(clientManagement.find(4));
        Product jacket = new Product("Esprit", 500);
        Product trousers = new Product("Jeans", 90);
        clothShopHouse.add("Jacket", jacket, 30);
        clothShopHouse.add("Trousers", trousers,50);

        System.out.println(clothShopHouse);
        order.addBuyProduct(new ClothProduct( "Jacket", jacket,1));
        order.addBuyProduct(new ClothProduct("Trousers", trousers,1));
        System.out.println(order);
        clothShopHouse.delOfOrder(order.getShoppingList());
        System.out.println(clothShopHouse);

    }
}