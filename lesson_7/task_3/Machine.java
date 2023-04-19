package lesson_7.task_3;

import java.util.ArrayList;
import java.util.List;

public interface Machine {
    List<Product> products = new ArrayList<Product>();

    public Product getProductByName();
    public Product getProductByPrice();

    public static void addProduct(String name, int cost){
        Product Product = new Product(name, cost);
        products.add(Product);
    }
}
