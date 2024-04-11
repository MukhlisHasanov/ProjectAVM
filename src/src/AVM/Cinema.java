package src.AVM;


import src.general.Client;

import java.util.*;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Client> idMap = new HashMap<>();

    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        char operation;
        do {
            operation = scanner.next().charAt(0);
            System.out.println(" Enter operation ([a]dd,[d]elete,[u]pdate,[p]rint,[f]ind,[m]ovie,[e]xit): ");
            switch (operation) {
                case 'a':
                    add(clients);
                    break;
                case 'd':
                    delete(clients);
                    break;
                case 'u':
                    update(clients);
                    break;
                case 'p':
                    print(clients);
                    break;
//                case 'f':
//                    find(clients);
//                    break;
//                case 'm':
//                    movie(clients);
//                    break;
                case 'e':
                    break;
                default:

            }

        } while (operation != 'e');
    }
    static void add(List<Client> persons) {
        System.out.print("Add: name & age: ");
        String name = scanner.next();
        int age = scanner.nextInt();
        Client client = new Client(name, id, age);
        idMap.put(client.getId(), client);
        persons.add(client);
    }

    static void delete(List<Client> persons) {
        System.out.print("Delete: id: ");
        int id = scanner.nextInt();
        //Person findPerson = findById(persons, id);
        Client findPerson = idMap.get(id);
        if (findPerson != null) {
            persons.remove(findPerson);
            idMap.remove(id);
        }
    }

    static void update(List<Client> persons) {
        System.out.print("Update: id & name & age: ");
        int id = scanner.nextInt();
        String name = scanner.next();
        int age = scanner.nextInt();
        //Person findPerson = findById(persons, id);
        Client findPerson = idMap.get(id);
        if (findPerson != null) {
            findPerson.setName(name);
            findPerson.setAge(age);
        }
    }

    static void find() {
        System.out.print("Find: id: ");
        int id = scanner.nextInt();
        Client findPerson = idMap.get(id);
        if (findPerson != null) {
            System.out.println(findPerson);
        }
    }

    static Client findById(List<Client> persons, int id) {
        for (Client person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    static void print(List<Client> persons) {
        persons.forEach(System.out::println);
    }
}