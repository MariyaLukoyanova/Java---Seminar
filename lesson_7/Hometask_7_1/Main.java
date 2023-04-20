package lesson_7.Hometask_7_1;

public class Main {
    public static void main(String[] args) {

        HotDrinkMachine hotMachine = new HotDrinkMachine();
        hotMachine.addDrink(new HotDrink("coffee", 200, 50));
        hotMachine.addDrink(new HotDrink("tea", 400, 70));
        System.out.println(hotMachine.getProduct("tea", 400, 70));
        System.out.println(hotMachine.getProduct("raf", 400, 70));
    }
}
