package avm.controller;

import avm.service.MarketService;

import java.util.Scanner;

public class AvmController {
    private final MarketService marketService;
    private final Scanner scanner;

    public AvmController(final MarketService marketService) {
        this.marketService = marketService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        char cmd;
        MarketController marketController = new MarketController(marketService, scanner);
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
                    System.out.println("Welcome to AVM Cloth Shop!");
                    break;
                case 'i':
                    System.out.println("Welcome to AVM Cinema!");
                    break;
                case 'x':
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Hope see you again!");
            }
        } while (cmd != 'x');
        System.out.println("Exit.");
    }
}

