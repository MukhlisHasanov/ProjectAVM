package huperMarket;

import general.BaseOrder;
import general.BaseProduct;
import general.Client;
import general.Order;

public class MarketOrder extends BaseOrder {
    public MarketOrder(Client client) {
        super(client);
    }

    public boolean addBuyProduct(int id, int quantity) {
        BaseProduct product = new WareHouse().idMap.get(id);
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
}
