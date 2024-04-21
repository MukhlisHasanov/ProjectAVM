package avm.controller;



import avm.service.ClothService;
import avm.service.MarketService;

import java.util.Scanner;

public class AvmController {
    private final MarketService marketService;
    private final ClothService clothService;
    private final Scanner scanner;

    public AvmController(final MarketService marketService,
                         final ClothService clothService) {
        this.marketService = marketService;
        this.clothService = clothService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        char cmd;
        MarketController marketController = new MarketController(marketService, scanner);
        ShopController shopController = new ShopController(clothService, scanner);
        do {
            System.out.println("Choose service: [h]ypermarket, [c]afe, cloth[s]hop, c[i]nema, e[x]it: ");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case 'h':
                    marketController.run();
                    break;
                case 'c':
                    System.out.println("Welcome to AVM Ice Cafe!");
                    break;
                case 's':
                    shopController.run();
                    System.out.println("Welcome to AVM Cloth Shop!");
                    break;
                case 'i':
                    System.out.println("Welcome to AVM Cinema!");
                    break;
                case 'x':
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Unrecognized command");
            }
        } while (cmd != 'x');
        System.out.println("Exit.");
    }
}

