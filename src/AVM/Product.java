package AVM;
/**
 * ProjectAVM
 * @author Valerian
 * @version 02.04.2024
 */


public class Product extends ProductCount{

    public String name;
    public float price;

    public Product(Product product, int count) {
        super(product, count);
    }

    @Override
    public String toString() {
        return "{" + name + ", " + price + '}';
    }
}
