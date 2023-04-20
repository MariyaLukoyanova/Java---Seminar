package lesson_7.Hometask_7_1;


import java.util.ArrayList;

public interface VendMachine {
    public String getProduct(String name, int volume, int temp);

    public ArrayList<HotDrink> addDrink(Drink drink);
}

