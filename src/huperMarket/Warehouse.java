package huperMarket;

import general.Product;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    public List<MarketProduct> products;

    public Warehouse() {
        this.products = new ArrayList<>();
    }

    public void add(int id, Product product, String type, int quantity) {
        boolean found = false;
        for (MarketProduct item : products) {
            if (item.getProduct().equals(product)) {
                item.setQuantity(item.getQuantity() + quantity);
                found = true;
                return;
            }
        }
        if (!found) {
            products.add(new MarketProduct(id, product, type, quantity));
        }
    }

    public int indexOf(Product product) {
        int idx = 0;
        for (MarketProduct item : products) {
            if (item.getProduct().equals(product)) {
                return idx;
            }
        }
        return -1;
    }

    public void del(Product product) {
        products.remove(indexOf(product));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Warehouse\n");
        for (MarketProduct pac : products) {
            str.append(pac + "\n");
        }
        return str.toString();
    }
}
