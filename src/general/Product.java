package general;

public class Product {

public String name;
public float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + price + '}';
    }
}