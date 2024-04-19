package general;


import avm.data.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Initializer {
    private static Map<Integer, avm.data.Movie> movieMap;
    public Initializer() {
        movieMap = new HashMap<>();
    }

    public static void initMovie() {
        List<avm.data.Movie> movies = new ArrayList<>();
        movies.addAll(List.of(
                new Movie("Avatar", "Fantasy", 50),
                new Movie("Back to the Future 3D","Fantasy", 70),
                new Movie("Taxi_1", "Comady",15),
                new Movie("Taxi_2","Comady", 15),
                new Movie("Johnny English","Comady", 20),
                new Movie("Crocodile Dundee","Comady", 20),
                new Movie("Crocodile Dundee2","Comady", 20),
                new Movie("Beethoven","Comady", 15),
                new Movie("Beethoven2","Comady", 20),
                new Movie("Nu Pogodi","Animatation", 15)
        ));
        movieMap = movies.stream().collect(Collectors.toMap(avm.data.Movie::getId, p -> p));

    }

}
