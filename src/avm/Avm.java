package avm;

import avm.controller.AvmController;
import avm.controller.ClientController;
import avm.repository.ClientRepository;
import avm.repository.ClothRepository;
import avm.repository.MarketRepository;
import avm.repository.MovieRepository;
import avm.service.CinemaService;
import avm.service.ClothService;
import avm.service.MarketService;
import avm.test.ClientManagement;


public class Avm {
    public static void main(String[] args) {
//        ClientRepository clientRepository = new ClientRepository();
//        ClientController clientController = new ClientController(clientRepository);
//        clientRepository.initClient();
//        clientController.start();
//        System.out.println(clientRepository);
        ClientManagement clientManagement = new ClientManagement();
        clientManagement.add("Valerian", 38);
//        ClientRepository clientRepository = new ClientRepository();
        MarketRepository marketRepository = new MarketRepository();
        ClothRepository clothRepository = new ClothRepository();
        MovieRepository movieRepository = new MovieRepository();
//        ClientManagement clientManagement = new ClientManagement();
        MarketService marketService = new MarketService(clientManagement.find(1),marketRepository);
        ClothService clothService = new ClothService(clientManagement.find(1), clothRepository);
        CinemaService cinemaService = new CinemaService(clientManagement.find(1), movieRepository);
//        clientRepository.initClient();
        marketRepository.initMarket();
        clothRepository.initCloth();
        movieRepository.initMovie();
        new AvmController(marketService, clothService, cinemaService).run();


    }
}
