import general.Client;
import general.ClientManagement;

import java.util.ArrayList;
import java.util.List;

public class GanjlikMall {
    public static void main(String[] args) {
      
        ClientManagement clientManagement = new ClientManagement();
        clientManagement.add("V", 10);
        clientManagement.add("M", 9);
        clientManagement.add("A", 11);
        clientManagement.add("A", 14);
        clientManagement.printClients();
        clientManagement.delete(4);
        clientManagement.printClients();

    }
}
