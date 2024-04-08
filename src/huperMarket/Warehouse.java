package huperMarket;

import general.Product;

import java.util.ArrayList;
import java.util.List;

public class Warehouse extends MarketProduct{
    public List<MarketProduct> products;

    public Warehouse(int id, Product product, String type, int quantity) {
        super(id, product, type, quantity);
        super.products = new ArrayList<>();
    }

    public Warehouse() {
    }

    public boolean add(Product product, int quantity) {
        int idx = indexOf(product);
        if (idx >= 0) {
            MarketProduct temp = products.get(idx);
            temp.setQuantity(temp.getQuantity() + quantity);
            products.set(idx, temp);
            return true;
        } else {
            return false;
        }
    }

    public boolean add(int id, int quantity) {
        int idx = indexOf(id);
        if (idx >= 0) {
            MarketProduct temp = products.get(idx);
            temp.setQuantity(temp.getQuantity() + quantity);
            products.set(idx, temp);
            return true;
        } else {
            return false;
        }
    }

    public int indexOf(Product product) {
        for (MarketProduct item : products) {
            if (item.getProduct().equals(product)) {
                return products.indexOf(item);
            }
        }
        return -1;
    }

    public int indexOf(int id) {
        for (MarketProduct item : products) {
            if (item.getId() == id) {
                return products.indexOf(item);
            }
        }
        return -1;
    }

    public void del(Product product) {
        products.remove(indexOf(product));
    }

    public void del(int id) {
        products.remove(indexOf(id));
    }

//    @Override
//    public String toString() {
//        StringBuilder str = new StringBuilder("Warehouse\n");
//        for (MarketProduct pac : products) {
//            str.append(pac + "\n");
//        }
//        return str.toString();
//    }
}
