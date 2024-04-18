package huperMarket;

import general.BaseOrder;
import general.BaseProduct;
import general.Client;
import general.Order;

public class MarketOrder extends BaseOrder {
    private WareHouse wareHouse;
    public MarketOrder(Client client, WareHouse wareHouse) {
        super(client);
        this.wareHouse = wareHouse;
    }

    public boolean addToOrder(int id, int quantity) {
        BaseProduct product = wareHouse.idMap.get(id);
        Order order = new Order();
        if (product != null) {
            order.setId(id);
            order.setProduct(product.getProduct());
            order.setQuantity(quantity);
            orderList.add(order);
            return true;
        }
        return false;
    }
    public void removeFromOrder() {

    }

    public void updateOrder() {

    }

//    public MarketOrder printOrder() {
//        return marketOrder;
//    }
}
