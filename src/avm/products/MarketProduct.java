package avm.products;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Project AVM/Hypermarket
 * @author Mukhlis/Andrey
 * @version Apr-2024
 */

// In this class we show the methods associated with the market products class
public class MarketProduct extends BaseProduct {
    private int quantity;
    private static int idCounter = 0;

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
        return "[id: " + id +
                ", Product: " + name +
                ", Price" + price + " EUR, " +
                "Quan-ty: " + quantity + "]";
    }
}
