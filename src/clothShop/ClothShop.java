//package clothShop;
//
//import avm.test.ClientManagement;
//import general.Product;
//import general.BaseOrder;
//
//public class ClothShop {
//    public static void main(String[] args) {
//        ClientManagement clientManagement = new ClientManagement();
//        ClothShopWareHouse clothShopHouse = new ClothShopWareHouse();
//        BaseOrder order = new BaseOrder(clientManagement.find(4));
//        Product jacket = new Product("Esprit", 500);
//        Product trousers = new Product("Jeans", 90);
//        clothShopHouse.add("Jacket", jacket, 30);
//        clothShopHouse.add("Trousers", trousers,50);
//
//        System.out.println(clothShopHouse);
////        order.addBuyProduct(3, 1);
////        order.addBuyProduct(new ClothProduct("Trousers", trousers,1));
////        System.out.println(order);
////        clothShopHouse.delOfOrder(order.getOrderList());
////        System.out.println(clothShopHouse);
//
//    }
//}