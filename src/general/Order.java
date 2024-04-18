package general;

public class Order {
    protected int id;
    protected Product product;
    protected int quantity;

//    public Order(int id, Product product, int quantity) {
//        this.id = id;
//        this.product = product;
//        this.quantity = quantity;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
