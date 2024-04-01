import general.Product;
import huperMarket.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product tv = new Product("Samsung 34'", 800);
        Product laptop = new Product("Lenovo T590", 1000);

        Warehouse warehouse= new Warehouse(1);
        warehouse.add(tv, "household", 50);
        warehouse.add(laptop, "computer", 10);
        System.out.println(warehouse);
        warehouse.add(tv, "household", 50);
        System.out.println(warehouse);
    }
}