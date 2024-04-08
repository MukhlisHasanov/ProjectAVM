import cinema.CinemaHouse;
import general.Product;
import huperMarket.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product tv = new Product("Samsung 34'", 800);
        Product laptop = new Product("Lenovo T590", 1000);
        Product bread = new Product("Bublik", 1.98f);
        Product meat = new Product("Beef", 6.50f);

        CinemaHouse cinemaHouse = new CinemaHouse();
        Warehouse warehouse= new Warehouse();
        warehouse.add(1, tv, "household", 50);
        System.out.println(warehouse);
        warehouse.add(2, laptop, "computer", 10);
        System.out.println(warehouse);
        warehouse.add(1, tv, "household", 40);
        System.out.println(warehouse);
        warehouse.add(3, bread, "food", 100);
        warehouse.add(4, meat, "food", 15);
        System.out.println(warehouse);
        warehouse.add(2, laptop, "computer", 15);
        warehouse.add(3, bread, "food", 25);
        System.out.println(warehouse);
        // remove
        warehouse.del(tv);
        System.out.println(warehouse);
        warehouse.add(laptop, 50);
        warehouse.add(3, 50);
        warehouse.add(4, 50);
        System.out.println(warehouse);
        warehouse.del(3);
        System.out.println(warehouse);
    }
}