package lesson_12.Homework_12_6.view;

import lesson_12.Homework_12_6.controller.VendController;
import lesson_12.Homework_12_6.product.Cocktail;
import lesson_12.Homework_12_6.product.Drink;
import lesson_12.Homework_12_6.product.HotDrink;

public class Main {
    public static void main(String[] args) {
        // Класс DrinkMachin разбит на несколько для разделения зон отвественности
        // Пользователь обращается только к классу VendController без доступа к основной логике
        // Можно добавлять новые продукты без изменения внутренней реализации 

        VendController user = new VendController();

        user.setDrink(new Drink("Cola", 500));
        user.setDrink(new HotDrink("coffee", 200, 50));
        user.setDrink(new Drink("Pepsi", 500));
        user.setDrink(new HotDrink("tea", 400, 70));
        user.setDrink(new Cocktail("Rom", 50, 40.0));
        user.setDrink(new Cocktail("Wine", 150, 12.5));

        user.getMenu();
        user.getDrink();
        
    }
}
