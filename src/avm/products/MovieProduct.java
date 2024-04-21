package avm.products;

public class MovieProduct extends BaseProduct{
    private static int idCounter = 0;
    private int quantity;
    private String genre;
    public MovieProduct(String name, String genre, float price) {
        super(name, price);
        this.genre = genre;
        this.id = ++idCounter;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "product= [" + id + ", " + name + ", " + price + ", " + quantity + ']';
    }
}
