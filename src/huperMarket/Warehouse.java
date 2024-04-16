package huperMarket;

import general.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    public List<MarketProduct> products;
    Map<Integer, MarketProduct> idMap;
    Map<Product, MarketProduct> productMap;

    public Warehouse() {
        products = new ArrayList<>();
        idMap = new HashMap<>();
        productMap = new HashMap<>();
    }



    public void delOfOrder(List<MarketProduct> products) {
        for (MarketProduct buyList : products) {
            boolean found = false;
            for (MarketProduct productList : this.products) {
                if (productList.getProduct().equals(buyList.getProduct())) {
                    if (productList.getQuantity() >= buyList.getQuantity()) {
                        productList.setQuantity(productList.getQuantity() - buyList.getQuantity());
                        found = true;
                        break;
                    }
                }
            }
        }
    }

    public void add(String type, Product product, int quantity) {
        MarketProduct addProduct = productMap.get(product);
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + quantity);
        }
        MarketProduct item = new MarketProduct(type, product, quantity);
        idMap.put(item.getId(), item);
        productMap.put(item.getProduct(),item);
        products.add(item);
    }

    public boolean add(Product product, int quantity) {
        MarketProduct addProduct = productMap.get(product);
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + quantity);
            return true;
        }
        return false;
    }

    public boolean add(int id, int quantity) {
        MarketProduct addProduct = idMap.get(id);
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + quantity);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        MarketProduct delProduct = idMap.get(id);
        if (delProduct != null) {
            products.remove(delProduct);
            idMap.remove(id);
            productMap.remove(delProduct.getProduct());
            return true;
        }
        return false;
    }

    public boolean delete(Product product) {
        MarketProduct delProduct = productMap.get(product);
        if (delProduct != null) {
            products.remove(delProduct);
            idMap.remove(delProduct.getId());
            productMap.remove(product);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Warehouse\n");
        for (MarketProduct pac : products) {
            str.append(pac + "\n");
        }
//        str.append("idMap: " + idMap + "\n");
//        str.append("productMap: " + productMap + "\n");
        return str.toString();
    }
}
