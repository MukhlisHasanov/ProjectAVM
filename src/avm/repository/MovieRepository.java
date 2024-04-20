package avm.repository;



import avm.products.MovieProduct;

import java.util.*;

public class MovieRepository {
    private Map<Integer, MovieProduct> movieMap;

    public MovieRepository() {
        movieMap = new HashMap<>();
    }

    public void put(MovieProduct movieProduct) {
        movieMap.put(movieProduct.getId(), movieProduct);
    }

    public MovieProduct get(int id) {
        return movieMap.get(id);
    }

    public void remove(int id) {
        movieMap.remove(id);
    }

    public Collection<MovieProduct> values() {
        return movieMap.values();
    }

    public void init() {
        List<MovieProduct> movieProducts = new ArrayList<>(List.of(
                new MovieProduct("Avatar", "Fantasy", 12.50f)
        ));
        movieProducts.forEach(movieProduct -> put(movieProduct));
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MovieRepository:\n");
        movieMap.forEach((Integer, movieProduct) -> {
            sb.append(movieProduct).append("\n");
        });
        return sb.toString();
    }
}
