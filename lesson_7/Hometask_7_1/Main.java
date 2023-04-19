package lesson_7.Hometask_7_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotDrinkMachine hotMachine = new HotDrinkMachine();
        HotDrink hotDrink1 = new HotDrink("coffee", 200, 50);
        HotDrink hotDrink2 = new HotDrink("tea", 400, 70);
        List<HotDrink> hotDrink = new ArrayList<HotDrink>();
        hotDrink.add(hotDrink1);
        hotDrink.add(hotDrink2);
System.out.println(hotMachine.getProduct("tea", 400, 70, hotDrink)); 
System.out.println(hotMachine.getProduct("raf", 400, 70, hotDrink));
    }
}

