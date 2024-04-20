package avm.service;


import avm.products.MarketProduct;
import avm.repository.MarketRepository;
import general.Client;


import java.util.HashMap;
import java.util.Map;


public class MarketService {
    private Client client;
    private MarketRepository repository;
    Map<Integer, MarketProduct> productList;
    public MarketService(Client client, MarketRepository repository) {
        this.client = client;
        this.repository = repository;
        productList = new HashMap<>();
    }

    public boolean addToOrder(int id, int quantity) {
        MarketProduct marketProduct = repository.get(id);
        if (marketProduct != null && marketProduct.getQuantity() >= quantity) {
            if (productList.containsKey(id)) {
                MarketProduct existingProduct = productList.get(id);
                existingProduct.setQuantity(existingProduct.getQuantity() + quantity);
            } else {
                MarketProduct newProduct = new MarketProduct(marketProduct);
                newProduct.setQuantity(quantity);
                newProduct.setId(newProduct.getId() - 1);
                productList.put(id, newProduct);
            }
            marketProduct.setQuantity(marketProduct.getQuantity() - quantity);
            return true;
        }
        return false;
        }

    public boolean removeFromOrder(int id) {
        if (productList.containsKey(id)) {
            productList.remove(id);
            return true;
        }
        return false;
    }

    public void removeFromOrder(int id, int quantityToRemove) {
        if (productList.containsKey(id)) {
            MarketProduct product = productList.get(id);
            int currentQuantity = product.getQuantity();

            int newQuantity = currentQuantity - quantityToRemove;
            if (newQuantity <= 0) {
                productList.remove(id);
            } else {
                product.setQuantity(newQuantity);
            }
        }
    }

    public void updateOrder() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Cart of " +
                "client=" + client);
        sb.append("shopping Cart: \n");
        productList.forEach((Integer, marketProduct) -> {
            sb.append(productList).append("\n");
        });
       return sb.toString();
    }

    public void print() {
        System.out.println(productList);
    }

    public void productList() {
        System.out.println(repository);
    }
}
