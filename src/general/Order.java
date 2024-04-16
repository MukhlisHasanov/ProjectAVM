package general;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Client client;
    List<BaseProduct> shoppingList;

    public Order(Client client) {
        this.client = client;
        shoppingList = new ArrayList<>();
    }

    public void addBuyProduct(BaseProduct product) {      // adding a product that the client buys

        shoppingList.add(product);
    }

    public List<BaseProduct> getShoppingList() {
        return shoppingList;
    }

    @Override
    public String toString() {
        return  "client=" + client +
                "\nshoppingList=" + shoppingList;
    }
}
