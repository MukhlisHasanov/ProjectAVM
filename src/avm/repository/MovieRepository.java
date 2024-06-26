package avm.repository;

import avm.products.MovieProduct;
import java.util.*;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Project AVM/Cinema
 * @author Rodion/Alexander
 * @version Apr-2024
 */
public class MovieRepository {
    private Map<Integer, MovieProduct> movieMap;

    public MovieRepository() {
        movieMap = new HashMap<>();
    }

    public void put(MovieProduct movieProduct) {
        movieMap.put(movieProduct.getId(),movieProduct);
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

    public void initMovie() {
        List<MovieProduct> movieProducts = new ArrayList<>(List.of(
                new MovieProduct("Avatar", "Fantasy", 12.50f, 200),
                new MovieProduct("Back to the Future 3D", "Fantasy", 10.50f, 200),
                new MovieProduct("Taxi_1", "Comedy", 10, 200),
                new MovieProduct("Taxi_2", "Comedy", 10, 200),
                new MovieProduct("Johnny English", "Comedy", 11, 200),
                new MovieProduct("Crocodile Dundee", "Comedy", 12.50f, 200),
                new MovieProduct("Crocodile Dundee2", "Comedy", 12.50f, 200),
                new MovieProduct("Beethoven", "Comedy", 10, 200),
                new MovieProduct("Beethoven2", "Comedy", 10, 200),
                new MovieProduct("Nu Pogodi", "Animation", 8, 200)
        ));
        movieProducts.forEach(movieProduct -> put(movieProduct));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMovie Repository:\n");
        movieMap.forEach((Integer, movieProduct) -> {
            sb.append(movieProduct).append("\n");
        });
        return sb.toString();
    }
}
