package general;

import cinema.Cinema;
import clothShop.ClothShop;
import huperMarket.MarketController;
import huperMarket.MarketOrder;
import iceCafe.IceCafe;

import java.util.Scanner;

public class AvmController {
    private MarketController market;
    private IceCafe iceCafe;
    private ClothShop clothShop;
    private Cinema cinema;
    private Scanner scanner;

    public AvmController(final MarketController market,
                         final IceCafe iceCafe,
                         final ClothShop clothShop,
                         final Cinema cinema,
                         final Scanner scanner) {
        this.market = market;
        this.iceCafe = iceCafe;
        this.clothShop = clothShop;
        this.cinema = cinema;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        char operation;
        do {
            System.out.print("Choose service: [h]ypermarket, [i]ceCafe, cloth[s]hop, [c]inema, e[x]it: ");
            operation = scanner.nextLine().charAt(0);
            switch (operation) {
                case 'h':
                    System.out.println("Welcome to AVM Hypermarket!");
                    break;
                case 'i':
                    System.out.println("Welcome to AVM Ice Cafe!");
                    break;
                case 's':
                    System.out.println("Welcome to AVM Cloth Shop!");
                    break;
                case 'c':
                    System.out.println("Welcome to AVM Cinema!");
                    break;
                case 'x':
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Hope see you again!");
            }
        } while (operation != 'x');
        System.out.println("Exit.");
    }

    private void Market() {
        char operation;
        String[] input;
        String name, composition;
        int id, price;
        do {
            System.out.print("Pizza service: [a]dd, [u]pdate, [d]elete, [p]rint, [b]ack: ");
            operation = scanner.nextLine().charAt(0);
            switch (operation) {
                case 'a':
                    System.out.print("Pizza service: add: name & composition & price: ");
                    input = scanner.nextLine().split("&");
                    name = input[0].trim();
                    composition = input[1].trim();
                    price = Integer.valueOf(input[2].trim());
                    MarketOrder.add(name, composition, price);
                    break;
                case 'u':
                    System.out.print("Pizza service: update: id & name & composition & price: ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    name = input[1].trim();
                    composition = input[2].trim();
                    price = Integer.valueOf(input[3].trim());
                    MarketOrder.update(id, name, composition, price);
                    break;
                case 'd':
                    System.out.print("Pizza service: delete: id: ");
                    id = Integer.valueOf(scanner.nextLine());
                    MarketOrder.delete(id);
                    break;
                case 'p':
                    MarketOrder.print();
                    break;
                case 'b':
                    break;
                default:
                    System.out.println("Unrecognized command: " + operation);
            }
        } while (operation != 'b');
    }
}
    }

}
