package lesson_7.task_1;

public class Product {
    private String name;
    private int cost;

    public String getName(){
        return name;
    }

    public int getPrice(){
        return cost;
    }

    Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

public String toString(){
    return String.format("Product name: %s, cost: %d", name, cost);
}
}
