package lesson_12.Homework_12_6.controller;

import lesson_12.Homework_12_6.model.DrinkMachine;
import lesson_12.Homework_12_6.model.GetDrink;
import lesson_12.Homework_12_6.product.Drink;

public class VendController {
    private GetDrink get = new GetDrink();
    private DrinkMachine drinks = new DrinkMachine();

    public void getDrink() {
        get.getDrink();
    }

    
    public void setDrink(Drink drink) {
        drinks.setDrink(drink);
    }

public void getMenu(){
    drinks.getMenu();
}

}
