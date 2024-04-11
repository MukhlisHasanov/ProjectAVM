package src.huperMarket;

import src.general.Client;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Client client;
    List<MarketProduct> shoppingList;

    public Order(Client client) {
        this.client = client;
        this.shoppingList = new ArrayList<>();
    }

    public void addBayProduct(MarketProduct product) {
        shoppingList.add(product);
    }

    public List<MarketProduct> getShoppingList() {
        return shoppingList;
    }

    @Override
    public String toString() {
        return  "client=" + client +
                "\nshoppingList=" + shoppingList;
    }
}