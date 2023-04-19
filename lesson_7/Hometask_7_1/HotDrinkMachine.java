package lesson_7.Hometask_7_1;

import java.util.List;

public class HotDrinkMachine implements VendMachine {


    public String getProduct(String name, int volume, int temp, List<HotDrink> hotDrinks) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.name.equals(name) && (hotDrink.volume == volume) && (hotDrink.temperature == temp)) {
                return hotDrink.toString() + " is ready";
            }
        }
        return "No such drink";
    }

}
