package AVM;
/**
 * ProjectAVM
 * @author Valerian
 * @version 01.04.2024
 */


public class Product {
    int id;
    String name;
    float price;
    String typeOfProduct;

    public Product(int id, String name, float price, String typeOfProduct) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.typeOfProduct = typeOfProduct;
    }
}
