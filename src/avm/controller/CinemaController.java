package avm.controller;

import avm.service.MovieService;

import java.util.Scanner;

/**
 * AIT-TR, Cohort 42.1
 * Project AVM/Cinema
 * @author Valerian & Andrey
 * @version 14-04-24
 */

public class CinemaController {
    private MovieService movieService;
    private Scanner scanner;
//    public static void main(String[] args) {
//        System.out.println("Welcome to our Ganjlik movie theater.");

    private void cinemaServiceMenu() {
        char cmd;
        String[] input;
        String name, genre;
        int id, price;
        do {
            System.out.println("Cinema service: [a]dd, [u]pdate, [d]elete, [p]rint, [b]ack");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case 'a':
                    System.out.print("Movie service: add: name & genre & price: ");
                    input = scanner.nextLine().split("&");
                    name = input[0].trim();
                    genre = input[1].trim();
                    price = Integer.valueOf(input[2].trim());
                    movieService.add(name, genre, price);
                    break;
                case 'u':
                    System.out.println("Cinema service: update: id & name & Composition & price: ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    name = input[1].trim();
                    genre = input[2].trim();
                    price = Integer.valueOf(input[3].trim());
                    movieService.update(id, name, genre, price);
                    break;
                case 'd':
                    System.out.println("Movie service: delete: id: ");
                    id = Integer.valueOf(scanner.nextLine());
                    movieService.delete(id);
                    break;
                case 'p':
                    movieService.print();
                    break;
                case 'b':
                    break;
                default:
                    System.out.println("Wrong command: " + cmd);
            }
        } while (cmd != 'b');
    }
}
//        ClientManagement clientManagement = new ClientManagement();
//        CinemaHouse cinemaHouse = new CinemaHouse();
//        Order order = new Order(clientManagement.find(2));
//        Product movie1 = new Product("Avatar", 50);
//        Product movie2 = new Product("Back to the Future 3D", 70);
//        cinemaHouse.add("Fantasy", movie1, 200);
//        cinemaHouse.add("Fantasy", movie2,150);
//        System.out.println(cinemaHouse);
//        order.addBuyProduct(new CinemaProduct(1,"Fantasy", movie1,  5));
//        order.addBuyProduct(new CinemaProduct(2,"Fantasy", movie2,1));
//        System.out.println(order);
//        cinemaHouse.delOfOrder(order.getShoppingList());
//        System.out.println(cinemaHouse);

