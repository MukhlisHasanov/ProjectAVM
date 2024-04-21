package avm.products;

public class MovieProduct extends BaseProduct{

    private int quantity;
    private String genre;
    public MovieProduct(String name, String genre, float price, int quantity) {
        super(name, price);
        this.genre = genre;
        this.quantity = quantity;
    }

    public MovieProduct(MovieProduct product) {
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
        return "product= [" + id + ", "
                + name + ", "
                + price + ", "
                + quantity + ']';
    }
}
