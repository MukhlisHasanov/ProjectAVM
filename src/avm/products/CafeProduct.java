package avm.products;

/**
 * AIT-TR, cohort 42.1, Java Basic, Project AVM/Cafe
 * @author Alexander Germanow
 * @version Apr-2024
 */

// In this class we show the methods associated with the cafe class
public class CafeProduct extends BaseProduct {
    private int quantity;
    private static int idCounter = 0;

    public CafeProduct(String name, float price, int quantity) {
        super(name, price);
        this.quantity = quantity;
        this.id = ++idCounter;
    }

    public CafeProduct(CafeProduct product) {
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
                ", Price: " + price + " EUR, " +
                "Quan-ty: " + quantity + "]";
    }
}