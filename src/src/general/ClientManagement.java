package src.general;
import java.util.Iterator;
import java.util.List;

public class ClientManagement {
    public List<Client> clients;

    public ClientManagement(List<Client> clients) {
        this.clients = clients;
    }
//
//    public void addClient(Client client) {
//        clients.add(client);
//    }

    public void removeClientById(int id) {
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            if (client.getId() == id) {
                iterator.remove();
                System.out.println("Client id: " + id + " removed.");
                return;
            }
        }
        System.out.println("Client id: " + id + " didn't found.");
    }

    public void printClients() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}

