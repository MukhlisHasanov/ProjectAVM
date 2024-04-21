package avm;

import avm.controller.AvmController;
import avm.repository.ClothRepository;
import avm.repository.MarketRepository;
import avm.repository.MovieRepository;
import avm.service.CinemaService;
import avm.service.ClothService;
import avm.service.MarketService;
import general.ClientManagement;


public class Avm {
    public static void main(String[] args) {
        ClientManagement clientManagement = new ClientManagement();
        clientManagement.add("Valerian", 38);
        MarketRepository marketRepository = new MarketRepository();
        ClothRepository clothRepository = new ClothRepository();
        MovieRepository movieRepository = new MovieRepository();
        MarketService marketService = new MarketService(clientManagement.find(1),marketRepository);
        ClothService clothService = new ClothService(clientManagement.find(1), clothRepository);
        CinemaService cinemaService = new CinemaService(clientManagement.find(1), movieRepository);
        marketRepository.initMarket();
        clothRepository.initCloth();
        movieRepository.initMovie();
        new AvmController(marketService, clothService, cinemaService).run();

    }
}
