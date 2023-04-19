package lesson_7.task_3;

public class Main {
    public static void main(String[] args) {
       BottleMachine m = new BottleMachine();
    m.addProduct("Cola", 100); 
    m.addProduct("Water", 50);
    System.out.println(m.getProductByName("Cola").toString());
    System.out.println(m.getProductByPrice(50).toString());
    }

}
