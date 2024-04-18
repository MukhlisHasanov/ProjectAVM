package general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseWareHouse {
    protected List<BaseProduct> products;
    public Map<Integer, BaseProduct> idMap;
    protected Map<Product, BaseProduct> productMap;

    public BaseWareHouse() {
        products = new ArrayList<>();
        idMap = new HashMap<>();
        productMap = new HashMap<>();
    }



    public void delOfOrder(List<BaseProduct> products) {
        for (BaseProduct buyList : products) {
            boolean found = false;
            for (BaseProduct productList : this.products) {
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
        BaseProduct addProduct = productMap.get(product);
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + quantity);
        } else {
            BaseProduct item = new BaseProduct(type, product, quantity);
            idMap.put(item.getId(), item);
            productMap.put(item.getProduct(), item);
            products.add(item);
        }
    }

    public boolean add(Product product, int quantity) {
        BaseProduct addProduct = productMap.get(product);
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + quantity);
            return true;
        }
        return false;
    }

    public boolean add(int id, int quantity) {
        BaseProduct addProduct = idMap.get(id);
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + quantity);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        BaseProduct delProduct = idMap.get(id);
        if (delProduct != null) {
            products.remove(delProduct);
            idMap.remove(id);
            productMap.remove(delProduct.getProduct());
            return true;
        }
        return false;
    }

    public boolean delete(Product product) {
        BaseProduct delProduct = productMap.get(product);
        if (delProduct != null) {
            products.remove(delProduct);
            idMap.remove(delProduct.getId());
            productMap.remove(product);
            return true;
        }
        return false;
    }

    public List<BaseProduct> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Warehouse\n");
        for (BaseProduct pac : products) {
            str.append(pac + "\n");
        }
//        str.append("idMap: " + idMap + "\n");
//        str.append("productMap: " + productMap + "\n");
        return str.toString();
    }
}
