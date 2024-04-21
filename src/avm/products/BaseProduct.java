package avm.products;

public class BaseProduct {
    protected int id;
    protected String name;
    protected float price;
    private static int idCounter = 0;

    public BaseProduct(String name, float price) {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "product= [" + id + ", " + name + ", " + price + ", " + ']';
    }
}
