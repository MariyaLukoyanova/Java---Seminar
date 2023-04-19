package lesson_7.task_3;

public abstract class Product {
    protected String name;
    protected int cost;
    protected String prodType;

    public String getName(){
        return name;
    }

    public int getPrice(){
        return cost;
    }

    public String getProdType(){
        return prodType;
    }

    Product(String name, int cost, String prodType){
        this.name = name;
        this.cost = cost;
        this.prodType = prodType;
    }

public String toString(){
    return String.format("Product name: %s, cost: %d, type: %s", name, cost, prodType);
}
}
