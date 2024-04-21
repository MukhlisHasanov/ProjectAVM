package avm.service;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/ClothShop
 * @author Valerian
 * @version 20-04-24
 */


import avm.repository.ClothRepository;
import avm.products.ClothProduct;
import general.Client;

import java.util.HashMap;
import java.util.Map;

public class ClothService {
    private Client client;
    private ClothRepository clothRepository;
    Map<Integer, ClothProduct> productList;

    public ClothService(Client client, ClothRepository clothRepository) {
        this.client = client;
        this.clothRepository = clothRepository;
        productList = new HashMap<>();
    }

    public boolean addToOrder(int id, int quantity) {
        ClothProduct clothProduct = clothRepository.get(id);
        if (clothProduct != null && clothProduct.getQuantity() >= quantity) {
            if (productList.containsKey(id)) {
                ClothProduct existingProduct = productList.get(id);
                existingProduct.setQuantity(existingProduct.getQuantity() + quantity);
            } else {
                ClothProduct newProduct = new ClothProduct(clothProduct);
                newProduct.setQuantity(quantity);
                newProduct.setId(id);
                productList.put(id, newProduct);
            }
            clothProduct.setQuantity(clothProduct.getQuantity() - quantity);
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
            ClothProduct product = productList.get(id);
            int currentQuantity = product.getQuantity();
            int newQuantity = currentQuantity - quantityToRemove;
            if (newQuantity <= 0) {
                productList.remove(id);
            } else {
                product.setQuantity(newQuantity);
            }
        }
    }

//    public boolean update(int id, int quantity) {
//        ClothProduct clothProduct = clothRepository.get(id);
//        if (clothProduct != null) {
//            clothProduct.update(quantity);
//            return true;
//        }
//        return false;
//    }

    public void productList() {
        System.out.println(clothRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart of shop client: " + client + "\n");
        sb.append(("shopping cart: \n"));
        productList.forEach((Integer, clothProduct) -> {
            sb.append(clothProduct).append("\n");
        });
        return sb.toString();
    }
}
