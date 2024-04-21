package avm.controller;

import avm.products.Client;
import avm.repository.ClientRepository;
import avm.service.ClientService;

import java.util.Scanner;

public class ClientController {
    //  private ClientService service;
    private Scanner scanner;
    private ClientRepository clientRepository;
    public ClientController(ClientRepository clientRepository) {
     //   this.service = service;
        this.clientRepository = clientRepository;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to AVM!");
        System.out.print("Do you have client account? [y]es, [n]o");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("y")) {
            System.out.print("Enter account ID: ");
            int clientId = scanner.nextInt();
            scanner.nextLine();

            Client client = clientRepository.get(clientId);
            if (client != null) {
                System.out.println("Hello, " + client.getName() + "!");
            } else {
                System.out.println("ID NOT FOUND! Please check ID or sign up");
                registerNewClient();
            }
        } else if (choice.equals("n")) {
            System.out.println("Please, sign up");
            registerNewClient();
        } else {
            System.out.println("Unrecognized command. Try one more time");
            start();
        }
    }

    private void registerNewClient() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Client client = new Client(name, age);

        clientRepository.put(client);
        System.out.println("Congratulations you are registered! Your id: " + client.getId());


//    public void run() {
//        char cmd;
//        String[] input;
//        int id;
//        String name;
//        int age;
//        do {
//            System.out.print("Welcome to AVM! Do you have client account? [y]es or [n]o :");
//            cmd = scanner.nextLine().charAt(0);
//            switch (cmd) {
//                case 'y':
//                    System.out.print("Please enter your id: ");
//                    input = scanner.nextLine(id);
//                    id = Integer.valueOf(input[0].trim());
//                    clientRepository.get();
//
//                    break;
//                case 'n':
//                    System.out.println("Please enter your 'Name' & 'Age':  ");
//                    input = scanner.nextLine().split("&");
//                    name = String.valueOf(input[0].trim());
//                    age = Integer.valueOf(input[1].trim());
//                    clientRepository.initClient();
//                    break;
//                default:
//            }
//        }
    }
}
