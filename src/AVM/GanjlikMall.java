package AVM;

import java.util.ArrayList;
import java.util.List;

public class GanjlikMall {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        String[] names = {"Valerian", "Mukhlis", "Andrey", "Alexander", "Sergey"};
        int[] ids = {00001, 00002, 00003, 00004, 00005};
        int[] ages = {38, 30, 39, 41, 42};

        clients.add(new Client("Alex", 00006, 16 ));
        

        for (int i = 0; i < names.length; i++) {
            clients.add(new Client(names[i], ids[i], ages[i]));
        }

        for (Client client : clients) {
            System.out.println("Client: " + client.getName() + ", ID: " + client.getID() + ", Age: " + client.getAge());
            // client.buy(laptop);
            // andrey.buy(cheese);
            // mukhlis.watch(movie);
            // clients.giveDiscount(15);
        }
    }
}
