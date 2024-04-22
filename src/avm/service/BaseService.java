package avm.service;

import avm.products.BaseProduct;
import avm.products.Client;
import avm.repository.ProductRepository;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseService <T extends BaseProduct, R extends ProductRepository<T>> {
    protected R repository;
    protected Map<Integer, T> productList;
    private Client client;

    public BaseService(Client client, R repository) {
        this.repository = repository;
        this.client = client;
        productList = new HashMap<>();
    }

    public boolean addToOrder(int id, int quantity) {
        T product = repository.get(id);
        if (product != null && product.getQuantity() >= quantity) {
            if (productList.containsKey(id)) {
                T existingProduct = productList.get(id);
                existingProduct.setQuantity(existingProduct.getQuantity() + quantity);
            } else {
                T newProduct = createProduct(product);
                newProduct.setQuantity(quantity);
                newProduct.setId(id);
                productList.put(id, newProduct);
            }
            product.setQuantity(product.getQuantity() - quantity);
            System.out.println("You added: " + quantity + " pcs of " + product.getName() + " to shopping cart");
            return true;
        }
        return false;
    }

    public boolean removeFromOrder(int id) {
        T product = productList.get(id);
        if (productList.containsKey(id)) {
            int currentQuantity = product.getQuantity();
            productList.remove(id);
            T repositoryProduct = repository.get(id);
            repositoryProduct.setQuantity(repositoryProduct.getQuantity() + currentQuantity);
            System.out.println("You removed: " + currentQuantity + " pcs of " + product.getName() + " from shopping cart");
            return true;
        }
        return false;
    }

    public void removeFromOrder(int id, int quantityToRemove) {
        if (productList.containsKey(id)) {
            T product = productList.get(id);
            T repositoryProduct = repository.get(id);
            int currentQuantity = product.getQuantity();
            int newQuantity = currentQuantity - quantityToRemove;
            if (newQuantity <= 0) {
                productList.remove(id);
            } else {
                product.setQuantity(newQuantity);
            }
            repositoryProduct.setQuantity(repositoryProduct.getQuantity() + quantityToRemove);
            System.out.println("You removed: " + currentQuantity + " pcs of " + product.getName() + " from shopping cart");
        }
    }

    public float sumOrder() {
        float sum = 0.0f;
        for (T product : productList.values()) {
            sum += product.getPrice() * product.getQuantity();
        }
        return sum;
    }

    public void productList() {
        System.out.println(repository);
    }

    protected abstract T createProduct(T product);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCart of client: " + client + "\n");
        sb.append("Shopping cart: \n");
        productList.forEach((id, marketProduct) -> {
            sb.append(marketProduct).append("\n");
        });
        return sb.toString();
    }
}
