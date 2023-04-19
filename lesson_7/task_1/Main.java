package lesson_7.task_1;

public class Main {
    public static void main(String[] args) {
       Machine m = new Machine();
    m.addProduct("Cola", 100); 
    m.addProduct("Snikers", 50);
    System.out.println(m.getProductByName("Cola").toString());
    System.out.println(m.getProductByPrice(50).toString());
    }

}
