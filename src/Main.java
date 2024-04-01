import general.Product;
import huperMarket.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product tv = new Product("Samsung 34'", 800);
        Product laptop = new Product("Lenovo T590", 1000);
        Product bread = new Product("Bublik", 1.98f);
        Product meat = new Product("Beef", 6.50f);

        Warehouse warehouse= new Warehouse(1);
        warehouse.add(tv, "household", 50);
        warehouse.add(laptop, "computer", 10);
        System.out.println(warehouse);
        warehouse.add(tv, "household", 40);
        System.out.println(warehouse);
        warehouse.add(bread, "food", 100);
        warehouse.add(meat, "food", 15);
        System.out.println(warehouse);
        warehouse.add(laptop, "computer", 15);
        warehouse.add(bread, "food", 25);
        System.out.println(warehouse);
        // remove
        warehouse.del(tv);
        System.out.println(warehouse);
    }
}