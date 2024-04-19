package avm;

import avm.controller.AvmController;
import avm.controller.CinemaController;
import avm.controller.MarketController;
import general.ClientManagement;
import general.Initializer;

public class Avm {
    public static void main(String[] args) {

        ClientManagement clientManagement = new ClientManagement();
        clientManagement.add("V", 10);
        clientManagement.add("M", 9);
        clientManagement.add("A", 11);
        clientManagement.add("A", 14);
        clientManagement.printClients();
        clientManagement.delete(4);
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
        MarketController marketController = new MarketController();
        CinemaController cinemaController = new CinemaController();
        Initializer.initMovie();
//        AvmController controller = new AvmController(marketController, cinemaController);
//        controller.run();
        CinemaController controller = new CinemaController();
        controller.cinemaServiceMenu();
    }
}
