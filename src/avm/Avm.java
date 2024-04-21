package avm;

import avm.controller.AvmController;
import avm.controller.ClientController;
import avm.products.Client;
import avm.repository.*;
import avm.service.CafeService;
import avm.service.CinemaService;
import avm.service.ClothService;
import avm.service.MarketService;

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

        MarketService marketService = new MarketService(client,marketRepository);
        ClothService clothService = new ClothService(client, clothRepository);
        CinemaService cinemaService = new CinemaService(client, movieRepository);
        CafeService cafeService = new CafeService(client,cafeRepository);

        marketRepository.initMarket();
        clothRepository.initCloth();
        movieRepository.initMovie();
        cafeRepository.initCafe();

        new AvmController(marketService, clothService, cinemaService,cafeService).run();
    }
}
