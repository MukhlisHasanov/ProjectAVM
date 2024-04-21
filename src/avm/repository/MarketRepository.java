package avm.repository;

import avm.products.MarketProduct;
import java.util.*;

public class MarketRepository {
    private Map<Integer, MarketProduct> marketMap;

    public MarketRepository() {
        marketMap = new HashMap<>();
    }

    public void put(MarketProduct marketProduct) {
        marketMap.put(marketProduct.getId(), marketProduct);
    }

    public MarketProduct get(int id) {
        return marketMap.get(id);
    }

    public void remove(int id) {
        marketMap.remove(id);
    }

//    public Collection<MarketProduct> values() {
//        return marketMap.values();
//    }

    public void initMarket() {
        List<MarketProduct> marketProducts = new ArrayList<>(List.of(
                new MarketProduct("Samsung 34", 800, 50),
                new MarketProduct("Lenovo T590", 1000, 10),
                new MarketProduct("Liebherr", 1400, 5),
                new MarketProduct("Bublik", 1.98f, 100),
                new MarketProduct("Beef", 6.50f, 15),
                new MarketProduct("Pork", 5.5f, 60),
                new MarketProduct("Coca-Cola", 0.5f, 120),
                new MarketProduct("Flounder", 12, 25),
                new MarketProduct("Dorada", 12, 20),
                new MarketProduct("Salmon", 15.5f, 30),
                new MarketProduct("Chicken", 8.5f, 40),
                new MarketProduct("Duck", 15.5f, 15),
                new MarketProduct("Turkey", 9, 18),
                new MarketProduct("Salami", 5.5f, 12),
                new MarketProduct("Milk", 1, 100),
                new MarketProduct("Yoghurt", 1.2f, 30),
                new MarketProduct("Butter", 2.2f, 15),
                new MarketProduct("Cheese", 7.5f, 22),
                new MarketProduct("Salt", 0.5f, 25),
                new MarketProduct("Sugar", 1.25f, 250),
                new MarketProduct("Flour", 0.60f, 200),
                new MarketProduct("Olive", 12, 30),
                new MarketProduct("Lavera", 2.2f, 50),
                new MarketProduct("Soap", 1.3f, 70),
                new MarketProduct("Shampoo", 2.4f, 30),
                new MarketProduct("Riesling", 2.9f, 80)
        ));
        marketProducts.forEach(marketProduct -> put(marketProduct));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarketRepository:\n");
        marketMap.forEach((Integer, marketProduct) -> {
            sb.append(marketProduct).append("\n");
        });
        return sb.toString();
    }
}