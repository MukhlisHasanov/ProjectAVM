package avm.service;

import avm.domain.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieService {
    private static Map<Integer, Movie> movieMap;

    public MovieService() {
        movieMap = new HashMap<>();
    }

    public static void init() {
        List<Movie> movies = new ArrayList<>();
        movies.addAll(List.of(
                new Movie("Avatar", "Fantasy", 50),
                new Movie("Back to the Future 3D", "Fantasy", 70),
                new Movie("Taxi_1", "Comedy", 15)
        ));
        movies.forEach(p -> movieMap.put(p.getId(), p));
    }

    public void add(String name, String genre, int price) {
        Movie movie = new Movie(name, genre, price);
        movieMap.put(movie.getId(),movie);
    }

    public boolean update(int id, String name, String genre, int price) {
        Movie updMovie = movieMap.get(id);
        if (updMovie != null) {
            updMovie.update(name, genre, price);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        Movie delMovie = movieMap.get(id);
        if (delMovie != null) {
            movieMap.remove(id);
            return true;
        }
        return false;
    }

    public void print() {
        movieMap.values().forEach(System.out::println);
    }
}
