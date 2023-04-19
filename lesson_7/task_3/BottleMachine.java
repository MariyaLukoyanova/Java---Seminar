package lesson_7.task_3;

import java.util.ArrayList;
import java.util.List;

public class BottleMachine extends Product implements Machine{
    List<Product> products = new ArrayList<Product>();

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByPrice(int price) {
        for (Product product : products) {
            if (product.getPrice() == price) {
                return product;
            }
        }
        return null;
    }
}
