package avm.service;

import avm.products.MovieProduct;
import general.Client;
import java.util.HashMap;
import java.util.Map;
import avm.repository.MovieRepository;

public class CinemaService {
    private Client client;
    private MovieRepository movieRepository;
    Map<Integer, MovieProduct> productList;

    public CinemaService(Client client, MovieRepository movieRepository) {
        this.client = client;
        this.movieRepository = movieRepository;
        productList = new HashMap<>();
    }

    public boolean addToOrder(int id, int quantity) {
        MovieProduct movieProduct = movieRepository.get(id);
        if (movieProduct != null && movieProduct.getQuantity() >= quantity) {
            if (productList.containsKey(id)) {
                MovieProduct existingProduct = productList.get(id);
                existingProduct.setQuantity(existingProduct.getQuantity() + quantity);
            } else {
                MovieProduct newProduct = new MovieProduct(movieProduct);
                newProduct.setQuantity(quantity);
                newProduct.setId(id);
                productList.put(id, newProduct);
            }
            movieProduct.setQuantity(movieProduct.getQuantity() - quantity);
            return true;
        }
        return false;
    }

    public boolean removeFromOrder (int id) {
        if (productList.containsKey(id)) {
            productList.remove(id);
            return true;
        }
        return false;
    }
    public void removeFromOrder(int id, int quantityToRemove) {
        if (productList.containsKey(id)) {
            MovieProduct product = productList.get(id);
            int currentQuantity = product.getQuantity();
            int newQuantity = currentQuantity - quantityToRemove;
            if (newQuantity <= 0) {
                productList.remove(id);
            } else {
                product.setQuantity(newQuantity);;
            }
        }
    }


    public void productList() {
        System.out.println(movieRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer cinema cart: " + client + "\n");
        sb.append("Shopping cart: \n");
        productList.forEach((Integer, movieProduct) -> {
            sb.append(movieProduct).append("\n");
        });
        return sb.toString();
    }
}
