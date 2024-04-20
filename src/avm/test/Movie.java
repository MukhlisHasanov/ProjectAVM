//package avm.repository;
//
//public class Movie {
//    private int id;
//    private String name;
//    private String genre;
//    private int price;
//    private static int idCounter = 0;
//
//    public Movie(String name, String genre, int price) {
//        this.id = ++idCounter;
//        this.name = name;
//        this.genre = genre;
//        this.price = price;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void update(String name, String genre, int price) {
//        this.name = name;
//        this.genre = genre;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", genre='" + genre + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}
//
