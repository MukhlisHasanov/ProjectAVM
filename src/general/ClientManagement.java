package general;

import java.util.*;

public class ClientManagement {
    private List<Client> clients;
    Map<Integer, Client> idMap;

    public ClientManagement() {
        clients = new ArrayList<>();
        idMap = new HashMap<>();
    }

    public void add(String name, int age) {
        Client client = new Client(name, age);
        idMap.put(client.getId(),client);
        clients.add(client);
    }

    public boolean delete(int id) {
        Client delClient = idMap.get(id);
        if (delClient != null) {
            clients.remove(delClient);
            idMap.remove(id);
            System.out.println("Client id: " + id + " removed.");
            return true;
        }
        System.out.println("Client id: " + id + " didn't found.");
        return false;
    }

    public boolean update(int id, String name, int age) {
        Client updClient = idMap.get(id);
        if (updClient != null) {
            updClient.setName(name);
            updClient.setAge(age);
            return true;
        }
        return false;
    }

    public Client find(int id) {
        return idMap.get(id);
    }

    public void printClients() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        clients.forEach(p -> sb.append(p + "\n"));
        return sb.toString();
    }
}