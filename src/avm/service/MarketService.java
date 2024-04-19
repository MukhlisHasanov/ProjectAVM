package avm.service;

import avm.domain.MarketRepository;
import general.Client;
import avm.products.MarketProduct;

import java.util.ArrayList;
import java.util.List;

public class MarketService {
    private Client client;
    private MarketRepository repository;
    List<MarketProduct> productList;

    public MarketService(Client client, MarketRepository repository) {
        this.client = client;
        this.repository = repository;
        productList = new ArrayList<>();
    }

    public boolean add(int id, int quantity) {
        MarketProduct marketProduct = repository.get(id);
        if (marketProduct != null) {
            marketProduct.setQuantity(quantity);
            productList.add(marketProduct);
            return true;
        }
        return false;
    }

    public boolean remove(int id, int quantity) {
        MarketProduct removeMarketProduct = repository.get(id);
        if (removeMarketProduct != null) {
            removeMarketProduct.remove(quantity);
            return true;
        }
        return false;
    }

    public boolean update(int id, int quantity) {
        MarketProduct updMarketProduct = repository.get(id);
        if (updMarketProduct != null) {
            updMarketProduct.update(quantity);
            return true;
        }
        return false;
    }

    public void productList() {
        System.out.println(repository);
    }

    public void print() {
        System.out.println(productList);
    }
}
