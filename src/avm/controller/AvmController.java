package avm.controller;

import java.util.Scanner;

public class AvmController {
    private MarketController marketController;
    private CafeController cafeController;
    private ShopController shopController;
    private CinemaController cinemaController;
    private Scanner scanner;

    public AvmController(final MarketController marketController,
                         final CafeController cafeController,
                         final ShopController shopController,
                         final CinemaController cinemaController,
                         Scanner scanner) {
        this.marketController = marketController;
        this.cafeController = cafeController;
        this.shopController = shopController;
        this.cinemaController = cinemaController;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        char oper;
        do {
            System.out.println("Choose service: [h]ypermarket, [c]afe, cloth[s]hop, c[i]nema, e[x]it: ");
            oper = scanner.nextLine().charAt(0);
            switch (oper) {
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
        } while (oper != 'x');
        System.out.println("Exit.");
    }

    private void MarketController() {
        char oper;

    }
}
