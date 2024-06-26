package avm;

import avm.controller.AvmController;
import avm.controller.ClientController;
import avm.products.Client;
import avm.repository.*;
import avm.service.CafeService;
import avm.service.CinemaService;
import avm.service.ClothService;
import avm.service.MarketService;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Project #1 AVM
 * @author Mukhlis
 * @version Apr-2024
 */
public class Avm {
    public static void main(String[] args) {
        ClientRepository clientRepository = new ClientRepository();
        ClientController clientController = new ClientController(clientRepository);
        clientRepository.initClient();
        Client client = clientController.start();
//        System.out.println(clientRepository);

        MarketRepository marketRepository = new MarketRepository();
        ClothRepository clothRepository = new ClothRepository();
        MovieRepository movieRepository = new MovieRepository();
        CafeRepository cafeRepository = new CafeRepository();
        // Comment #1
        MarketService marketService = new MarketService(client,marketRepository);
        ClothService clothService = new ClothService(client, clothRepository);
        CinemaService cinemaService = new CinemaService(client, movieRepository);
        CafeService cafeService = new CafeService(client,cafeRepository);
// test 2
        marketRepository.initMarket();
        clothRepository.initCloth();
        movieRepository.initMovie();
        cafeRepository.initCafe();

        new AvmController(marketService, clothService, cinemaService,cafeService).run();
    }
}
