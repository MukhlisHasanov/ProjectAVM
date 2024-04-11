package src.general;

public class Order {
    int id;
    int quantity;
    String name;
    float price;

    public Order(int id, int quantity, String name, float price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }
}
