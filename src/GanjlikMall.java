
import general.ClientManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class GanjlikMall {
    private static String client;

    public static void main(String[] args) {

//        ClientManagement clientManagement = new ClientManagement();
//        clientManagement.add("V", 10);
//        clientManagement.add("M", 9);
//        clientManagement.add("A", 11);
//        clientManagement.add("A", 14);
//        clientManagement.printClients();
//        clientManagement.delete(4);
//        clientManagement.printClients();
//
//        clientManagement.add("ATR", 33);
//        clientManagement.printClients();

        int clientId, age;
        String name;
        char operation;
        final AtomicInteger idCounter = new AtomicInteger(1000);

        ClientManagement clientManagement = new ClientManagement();
        Scanner scanner = new Scanner(System.in);
        Map<String, String> idMap = new HashMap<>();

        System.out.println("WELCOME TO GANJLIK MALL AVM");
        System.out.print("Please enter your id number");

        //Filling in the initial data (can be replaced by loading from a database or file)
        idMap.put("1000", "Valerian");

        System.out.print("Enter id number: ");
        clientId = scanner.nextInt();

        if (idMap.containsKey(clientId)) {
            System.out.println("Welcome, " + idMap.get(clientId) + "!");
        } else {
            System.out.println("İd is missing.");
            System.out.print("Enter your name & age: ");
            name = scanner.nextLine();
            //System.out.print("Enter your age: ");
            age = scanner.nextInt();
            clientManagement.add(name, age);
            scanner.nextLine(); // clearing the buffer after nextint

            String newId = generateId(); // generating a new id
            idMap.put(newId, name);

            System.out.println("Your new id: " + newId);
            System.out.println("Welcome, " + name + "!");
        }

        scanner.close();
    }

    // Генерация айди по порядку возрастания
    private static String generateId() {
        AtomicInteger idCounter = null;
        return String.valueOf(idCounter.getAndIncrement());





//        do {
//            System.out.println("Enter operation ([a]dd, [d]elete, [u]pdate, [p]rint, [f]ind, e[x]it: ");
//            operation = scanner.next().charAt(0);
//            switch (operation) {
//                case 'a':
//                    System.out.println("Please enter name & age: ");
//                    name = scanner.next();
//                    age = scanner.nextInt();
//                    clientManagement.add(name, age);
//                    break;
//                case 'd':
//                    System.out.println("Enter client id which one you want to delete: ");
//                    id = scanner.nextInt();
//                    clientManagement.delete(id);
//                    break;
//                case 'u':
//                    System.out.println("Update: id & name & age:");
//                    id = scanner.nextInt();
//                    name = scanner.next();
//                    age = scanner.nextInt();
//                    clientManagement.update(id, name, age);
//                    break;
//                case 'p':
//                    System.out.println(clientManagement);
//                    break;
//                case 'f':
//                    System.out.println("Find: id: ");
//                    id = scanner.nextInt();
//                    System.out.println(clientManagement.find(id));
//                    break;
//                case 'x':
//                    break;
//                default:
//                    System.out.println("Undefined operation: " + operation);
//            }
//        } while (operation != 'x');
//        System.out.println("Nice to meet you: " + client);
//
    }
}
