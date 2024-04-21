package avm.products;

public class MarketProduct extends BaseProduct {
    private static int idCounter = 0;
    private int quantity;
    public MarketProduct(String name, float price, int quantity) {
        super(name, price);
        this.quantity = quantity;
        this.id = ++idCounter;
    }

    public MarketProduct(MarketProduct product) {
        super(product.getName(), product.getPrice());
        this.quantity = product.getQuantity();
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[id: " + id + ", Product: " + name + ", " + price + " EUR, Qua-ty" + quantity + "]";
    }
}
