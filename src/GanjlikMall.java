
import general.ClientManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class GanjlikMall {
    private static String client;

    public static void main(String[] args) {

        int clientId, age;
        String name;
        char operation;
        final AtomicInteger idCounter = new AtomicInteger(1001);

        ClientManagement clientManagement = new ClientManagement();
        Scanner scanner = new Scanner(System.in);
        Map<String, String> idMap = new HashMap<>();

        System.out.println("WELCOME TO GANJLIK MALL AVM");
        System.out.print("Please enter your id number: ");

        //Filling in the initial data (can be replaced by loading from a database or file)
        idMap.put("1000", "Valerian");

        clientId = Integer.parseInt(scanner.nextLine());

        if (idMap.containsKey(String.valueOf(clientId))) {
            System.out.println("Welcome, " + idMap.get(String.valueOf(clientId)) + "!");
        } else {
            System.out.println("İd is missing.");
            System.out.print("Enter your name & age: ");
            name = scanner.next();
            age = scanner.nextInt();
            clientManagement.add(name, age);

            String newId = generateId(idCounter); // Pass idCounter for generation
            idMap.put(newId, name);

            System.out.println("Your new id: " + newId);
            System.out.println("Welcome, " + name + " " + age + "!");
        }
    }

    // id generation in ascending order
    private static String generateId(AtomicInteger idCounter) {
        return String.valueOf(idCounter.getAndIncrement());
    }

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
