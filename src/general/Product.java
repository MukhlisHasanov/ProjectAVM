//package general;
//
//import java.util.Objects;
//
//public class Product {
//
//    private String name;
//    private float price;
//
//    public Product(String name, float price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return Float.compare(price, product.price) == 0 && Objects.equals(name, product.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, price);
//    }
//
//    @Override
//    public String toString() {
//        return "(" + name + ", " + price + ')';
//    }
//}
