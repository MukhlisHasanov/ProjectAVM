//package cinema;
///**
// * AIT-TR, Cohort 42.1
// * Project AVM/Cinema
// * @author Valerian & Andrey
// * @version 14-04-24
// */
//
//import general.ClientManagement;
//import general.Product;
//import general.BaseOrder;
//
//public class Cinema {
//    public static void main(String[] args) {
//        ClientManagement clientManagement = new ClientManagement();
//        CinemaWareHouse cinemaHouse = new CinemaWareHouse();
//        BaseOrder order = new BaseOrder(clientManagement.find(2));
//        Product movie1 = new Product("Avatar", 50);
//        Product movie2 = new Product("Back to the Future 3D", 70);
//        cinemaHouse.add("Fantasy", movie1, 200);
//        cinemaHouse.add("Fantasy", movie2,150);
//        System.out.println(cinemaHouse);
////        order.addBuyProduct(new CinemaProduct("Fantasy", movie1,  5));
////        order.addBuyProduct(new CinemaProduct("Fantasy", movie2,1));
////        System.out.println(order);
////        cinemaHouse.delOfOrder(order.getOrderList());
////        System.out.println(cinemaHouse);
//
//    }
//}
