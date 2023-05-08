package lesson_13.hometask.Homework_12_6.model;

import java.util.ArrayList;
import java.util.List;

import lesson_13.hometask.Homework_12_6.product.Drink;

// Класс реализует необходимый ему интерфейс
// Разделение классов - у каждого своя одна зона отвественности 

public class DrinkMachine implements VendMachine {

List<Drink> drinks = new ArrayList<Drink>();


@Override
public void getMenu() {
for (Drink drink : drinks) {
System.out.println(drink);
}}


@Override
public void setDrink(Drink drink) {
    drinks.add(drink);
}


}