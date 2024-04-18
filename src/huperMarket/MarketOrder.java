package huperMarket;

import general.Client;

import java.util.ArrayList;
import java.util.List;

public class MarketOrder {
    Client client;
    List<MarketProduct> shoppingList;

    public MarketOrder(Client client) {
        this.client = client;
        shoppingList = new ArrayList<>();
    }

    public void addBuyProduct(MarketProduct product) {      // adding a product that the client buys

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
