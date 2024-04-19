//package general;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class BaseOrder {
//
//    protected Client client;
//    protected List<Order> orderList;
//    protected Map<Integer, Product> idOrderMap;
//
//    public BaseOrder(Client client) {
//        this.client = client;
//        orderList = new ArrayList<>();
//        idOrderMap = new HashMap<>();
//    }
//
//    public List<Order> getOrderList() {
//        return orderList;
//    }
//
//    @Override
//    public String toString() {
//        return  "client=" + client +
//                "\nshoppingList=" + orderList;
//    }
//}
