import general.Client;
import general.ClientManagement;

import java.util.ArrayList;
import java.util.List;

public class GanjlikMall {
    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>(List.of(
                new Client("V", 1, 10),
                new Client("M", 2, 9),
                new Client("A", 3, 11),
                new Client("A", 4, 14)));
        ClientManagement clientManagement = new ClientManagement(clients);
        clientManagement.printClients();
        clientManagement.removeClientById(4);
        clientManagement.printClients();
//        Client cl1 = new Client("V", 1, 10);
//        Client cl2 = new Client("M", 2, 9);
//        Client cl3 = new Client("A", 3, 11);
//        Client cl4 = new Client("A", 4, 14);
//
//        clientManagement.addClient(cl1);
//        clientManagement.addClient(cl2);
//        clientManagement.addClient(cl3);
//        clientManagement.addClient(cl4);
    }
}
