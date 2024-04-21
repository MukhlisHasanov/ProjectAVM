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
        int size;
        do {
            System.out.println("Cloth Shop:\n[l] --> show clothes list,\n" +
                    "[a] --> add cloth to shopping cart\n" +
                    "[r] --> remove cloth from shopping cart\n" +
                    "[p] --> show shopping cart\n" +
                    "[b] --> back to previous menu");
            cdm = scanner.nextLine().charAt(0);
            switch (cdm) {
                case 'l':
                    service.productList();
                    break;
                case 'a':
                    System.out.print("Cloth Shop: Please enter values of cloth for adding.\nValues: 'id' & 'quantity': ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    quantity = Integer.valueOf(input[1].trim());
                    size = Integer.valueOf(input[2].trim());
                    service.addToOrder(id, quantity, size);
                    break;
                case 'r':
                    System.out.println("Cloth Shop: Please enter values of cloth for adding.\nValues: 'id' & 'quantity': ");
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
                    System.out.println("Unrecognized command: " + cdm);
            }
        }while (cdm != 'b');
    }
}
