package lesson_7.Hometask_7_1;

import java.util.ArrayList;

public class HotDrinkMachine implements VendMachine {

    ArrayList<HotDrink> hotDrink = new ArrayList<HotDrink>();

@Override
    public ArrayList<HotDrink> addDrink(Drink drink){
        if (drink instanceof HotDrink){
        hotDrink.add((HotDrink)drink);} 
        return hotDrink;
    }

    public String getProduct(String name, int volume, int temp) {
        for (HotDrink hotDrink : hotDrink) {
            if (hotDrink.name.equals(name) && (hotDrink.volume == volume) && (hotDrink.temperature == temp)) {
                return hotDrink.toString() + " is ready";
            }
        }
        return "No such drink";
    }

    

    

}
