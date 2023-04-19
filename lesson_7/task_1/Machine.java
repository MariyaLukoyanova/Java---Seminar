package lesson_7.task_1;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    List<Product> products = new ArrayList<Product>();
    ;

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

    public void addProduct(String name, int cost){
        Product Product = new Product(name, cost);
        products.add(Product);
    }
}
