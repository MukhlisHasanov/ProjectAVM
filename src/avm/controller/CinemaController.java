package avm.controller;

import java.util.Scanner;
import avm.service.CinemaService;

public class CinemaController {
    private CinemaService service;
    private Scanner scanner;

    public CinemaController (CinemaService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    public void run() {
        char cmd;
        String[] input;
        int quantity;
        int id;
        do {
            System.out.println("Cinema: Please enter the command: \n [l] --> movie list \n " +
                    "[a] --> add ticket to ticket cart \n" +
                    "[r] --> remove ticket from ticket cart \n" +
                    "[p] --> show ticket cart \n " +
                    "[b] --> back to previous menu");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case 'l':
                    service.productList();
                    break;
                case 'a':
                    System.out.println("Cinema: Please enter values of ticket for adding. \n Values: 'id' & 'quantity': ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    quantity = Integer.valueOf(input[1].trim());
                    service.addToOrder(id,quantity);
                    break;
                case 'r':
                    System.out.println("Cinema: Please enter values of ticket for adding. \n Values: 'id' & 'quantity': ");
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
                case 'p':
                    System.out.println(service);
                    System.out.println("Amount to be paid: " + service.sumOrder() + " EUR" + "\n");
                    break;
                case 'b':
                    break;
                default:
                    System.out.println("Unrecognized command: " + cmd);
            }
        } while (cmd != 'b');
    }
}
