package avm.controller;

import avm.service.MarketService;

import java.util.Scanner;

public class MarketController {
    private MarketService service;
    private Scanner scanner;

    public MarketController(MarketService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    public void run() {
        char cmd;
        String[] input;
        int quantity;
        int id;
        do {
            System.out.println("Market service: product [l]ist, cart: [a]dd, [r]emove, [u]pdate, [p]rint, [b]ack: ");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case 'l':
                    service.productList();
                    break;
                case 'a':
                    System.out.print("Market service: add to cart: id & quantity: ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    quantity = Integer.valueOf(input[1].trim());
                    service.add(id, quantity);
                    break;
                case 'r':
                    System.out.println("Market service: remove from cart: id & quantity: ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    quantity = Integer.valueOf(input[1].trim());
                    service.remove(id, quantity);
                    break;
                case 'u':
                    System.out.println("Market service: update cart: id & quantity: ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    quantity = Integer.valueOf(input[1].trim());
                    service.update(id, quantity);
                    break;
                case 'p':
                    service.print();
                    break;
                case 'b':
                    break;
                default:
                    System.out.println("Unrecognized command: " + cmd);
            }
        } while (cmd != 'b');
    }
}
