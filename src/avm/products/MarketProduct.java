package avm.products;

public class MarketProduct extends BaseProduct {
    private int quantity;
    public MarketProduct(String name, float price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void remove(int id) {
    }

    public void update(int quantity) {
    }

    @Override
    public String toString() {
        return "MarketProduct{" +
                "product= [" + id + ", " + name + ", " + price + ", " + ']' +
                "quantity=" + quantity +
                '}';
    }
}
