package lesson_7.Hometask_7_1;


import java.util.List;

public interface VendMachine {
    public String getProduct(String name, int volume, int temp, List<HotDrink> hotDrinks);
}

