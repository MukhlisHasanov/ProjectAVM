package AVM;
/**
 * ProjectAVM
 * @author Valerian
 * @version 02.04.2024
 */

public class ProductCount {
    private Product product;
    private int count;

    public ProductCount(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "{" + product + ", " + count + '}';
    }
}
