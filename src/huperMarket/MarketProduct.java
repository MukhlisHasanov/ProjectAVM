package huperMarket;

import general.Product;

public class MarketProduct {
    private int id;
    private String type;
    public Product product;
    private int quantity;
    private static int idCounter = 0;

    public MarketProduct( String type, Product product, int quantity) {
        this.id = ++idCounter;
        this.type = type;
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "product= [" + id + ", " + type + ", " + product + ", " + quantity + ']';
    }
}
