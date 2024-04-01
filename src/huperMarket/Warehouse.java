package huperMarket;

import general.Product;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int id;
    public List<MarketProduct> products;

    public Warehouse(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public void add(Product product, String type, int quantity) {
        boolean found = false;
        for (MarketProduct pac : products) {
            if (pac.getProduct().equals(product)) {
                pac.setQuantity(pac.getQuantity() + quantity);
                found = true;
                return;
            }
        }
        if (!found) {
            products.add(new MarketProduct(product, type, quantity));
        }
    }

    public int indexOf(Product product) {
        int idx = 0;
        for (MarketProduct pac : products) {
            if (pac.getProduct().equals(product)) {
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
