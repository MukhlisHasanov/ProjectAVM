package huperMarket;

import general.*;

public class MarketOrder extends BaseOrder {
    private BaseWareHouse wareHouse;
    public MarketOrder(Client client, BaseWareHouse wareHouse) {
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

    @Override
    public String toString() {
        return "MarketOrder{" +
                "wareHouse=" + wareHouse +
                '}';
    }

    //    public MarketOrder printOrder() {
//        return marketOrder;
//    }
}
