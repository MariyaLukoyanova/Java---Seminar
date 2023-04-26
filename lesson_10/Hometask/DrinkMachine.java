package lesson_10.Hometask;

import java.util.ArrayList;
import java.util.List;

public class DrinkMachine<N> implements VendMachine {
private N drink;

List<N> drinks = new ArrayList<N>();

public void setDrink(N newDrink){
    this.drink = newDrink;
    drinks.add(drink);
    System.out.println(drinks);
}


public void getDrink(){
    System.out.println("Get your oreder");
}



}
