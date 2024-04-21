//package iceCafe;
///**
// * AIT-TR, Cohort 42.1
// * Project AVM/IceCoffee
// * @author Valerian
// * @version 14-04-24
// */
//
//
//import avm.test.ClientManagement;
//import general.Product;
//import general.BaseOrder;
//
//public class IceCafe {
//    public static void main(String[] args) {
//        ClientManagement clientManagement = new ClientManagement();
//        IceWareHouse iceHouse = new IceWareHouse();
//        BaseOrder order = new BaseOrder(clientManagement.find(3));
//        Product Ice1 = new Product("chocolate", 3);
//        Product Ice2 = new Product("strawberry with chocolate", 5);
//        Product Cafe = new Product("latte macchiato", 3);
//        iceHouse.add("chocolate", Ice1, 30);
//        iceHouse.add("strawberry with chocolate", Ice2,30);
//        iceHouse.add("latte macchiato", Cafe,30);
//        System.out.println(iceHouse);
////        order.addBuyProduct(new IceProduct("Ice", Ice1,  5));
////        order.addBuyProduct(new IceProduct("Ice", Ice2,1));
////        order.addBuyProduct(new IceProduct("Cafe", Cafe,1));
////        System.out.println(order);
////        iceHouse.delOfOrder(order.getOrderList());
////        System.out.println(iceHouse);
//
//    }
//}
