package AVM;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectAVM
 * @author Valerian
 * @version 02.04.2024
 */

public class Warehouse {
    private List<Product> products;
    public Warehouse() {products = new ArrayList<>();}
    public void addAll(List<Product> products) {
        for (Product pac : products) {
            Product product = pac.getProduct();
            int count = pac.getCount();
            boolean found = false;
            for (ProductCount whpac : this.products) {
                if (whpac.getProduct().equals(product)) {
                    whpac.setCount(whpac.getCount() + count);
                    found = true;
                    break;
                }
            }
            if (!found) {
                this.products.add(pac);
            }
        }
    }
}

