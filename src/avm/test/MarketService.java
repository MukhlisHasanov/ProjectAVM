//package avm.test;
//
//import avm.test.MarketRepository;
////import general.Client;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MarketService {
////    private Client client;
//    private MarketRepository repository;
//    List<MarketProduct> productList;
////    protected Map<Integer, MarketProduct> idOrderMap;
//
//    public MarketService(MarketRepository repository) {
////        this.client = client;
//        this.repository = repository;
//        productList = new ArrayList<>();
////        idOrderMap = new HashMap<>();
//    }
//
//    public void add(int id, int quantity) {
//        MarketProduct marketProduct = repository.get(id);
//        if (marketProduct != null) {
//            marketProduct.setQuantity(quantity);
//            productList.add(marketProduct);
//        }
////        MarketProduct marketProduct = repository.get(id);
////        if (marketProduct != null) {
////            marketProduct.setQuantity(quantity);
////            productList.add(marketProduct);
////            return true;
////        }
////        return false;
//    }
//
//    public boolean remove(int id, int quantity) {
//        MarketProduct removeMarketProduct = productList.get(id);
//        if (removeMarketProduct != null) {
//            removeMarketProduct.remove(id, quantity);
//            return true;
//        }
//        return false;
//    }
//
//    public void update(int id, int quantity) {
//        MarketProduct updMarketProduct = repository.get(id);
//        if (updMarketProduct != null) {
//            updMarketProduct.setQuantity(quantity);
//        }
//    }
//
//    public void productList() {
//        System.out.println(repository);
//    }
//
//    public List<MarketProduct> getProductList() {
//        return productList;
//    }
//
//    public void print() {
//        System.out.println(productList);
//    }
//
//    @Override
//    public String toString() {
//        return "MarketService{" +
//                ", shoppingList=" + productList +
//                '}';
//    }
//}
//
