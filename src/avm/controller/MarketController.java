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
            System.out.println("Market service: [1] show product list; operations with shopping cart: [2] add, [3] remove, [4] print, [0] back: ");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case '1':
                    service.productList();
                    break;
                case '2':
                    System.out.print("Market service: add to cart: id & quantity: ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    quantity = Integer.valueOf(input[1].trim());
                    service.addToOrder(id, quantity);
                    break;
                case '3':
                    System.out.println("Market service: remove from cart: id & quantity: ");
                    input = scanner.nextLine().split("&");
                    if (input.length > 1) {
                        id = Integer.valueOf(input[0].trim());
                        quantity = Integer.valueOf(input[1].trim());
                        service.removeFromOrder(id, quantity);
                    } else {
                        id = Integer.valueOf(input[0].trim());
                        service.removeFromOrder(id);
                    }
                    break;
//                case 'u':
//                    System.out.println("Market service: update cart: id & quantity: ");
//                    input = scanner.nextLine().split("&");
//                    id = Integer.valueOf(input[0].trim());
//                    quantity = Integer.valueOf(input[1].trim());
//                    service.updateOrder(id, quantity);
//                    break;
                case '4':
                    System.out.println(service);;
                    break;
                case '0':
                    break;
                default:
                    System.out.println("Unrecognized command: " + cmd);
            }
        } while (cmd != '0');
    }
}
