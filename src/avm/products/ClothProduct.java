package avm.products;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/ClothShop
 * @author Valerian
 * @version 20-04-24
 */

public class ClothProduct extends BaseProduct {
    private int size;
    private int quantity;

    public ClothProduct(String name, float price, int size, int quantity) {
        super(name, price);
        this.size = size;
        this.quantity = quantity;
    }

    public ClothProduct(ClothProduct product) {
        super(product.getName(), product.getPrice());
        this.quantity = product.getQuantity();
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    @Override
//    public String toString() {
//        return "ClothProduct{" +
//                "size='" + size  +
//                ", quantity=" + quantity +
//                '}';
//    }

    @Override
    public String toString() {
        return "[" + id + ", "
                + name + ", "
                + size + ", "
                + price + ", "
                + quantity + ']';
    }
}
