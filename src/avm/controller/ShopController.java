package avm.controller;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/ClothShop
 * @author Valerian
 * @version 20-04-24
 */
import avm.service.ClothService;
import java.util.Scanner;

public class ShopController {
    public ClothService service;
    public Scanner scanner;

    public ShopController(ClothService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    public void run() {
        char cdm;
        String[] input;
        int quantity;
        int id;
        do {
            System.out.println("Cloth Shop: [1] show product list, [2] add, [3] remove, [4] print, [0]back: ");
            cdm = scanner.nextLine().charAt(0);
            switch (cdm) {
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
//                case '4':
//                    System.out.println("Market service: update cart: id & quantity: ");
//                    input = scanner.nextLine().split("&");
//                    id = Integer.valueOf(input[0].trim());
//                    quantity = Integer.valueOf(input[1].trim());
//                    service.update(id, quantity);
//                    break;
                case '4':
                    System.out.println(service);
                    break;
                case '0':
                    break;
                default:
                    System.out.println("Unrecognized command:" + cdm);
            }
        }while (cdm != '0');
    }
}
