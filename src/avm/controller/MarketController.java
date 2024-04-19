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

    public void run(); {
        char cmd;
        String[] input;
        String type, product;
        int quantity;
        do {
            
        }
    }
}
