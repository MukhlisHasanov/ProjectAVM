package huperMarket;

import general.Product;

public class MarketProduct {
    private int id;
    public Product product;
    private String type;
    private int quantity;

    public MarketProduct(int id, Product product, String type, int quantity) {
        this.id = id;
        this.product = product;
        this.type = type;
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
        return "product= [" + product + ", " + type + ", " + quantity + ']';
    }
}