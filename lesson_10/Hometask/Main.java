package lesson_10.Hometask;

public class Main {
    public static void main(String[] args) {
        DrinkMachine<Drink> drink = new DrinkMachine<>();
        DrinkMachine<HotDrink> hotDrink = new DrinkMachine<>();

        drink.setDrink(new Drink("Cola", 500));
        hotDrink.setDrink(new HotDrink("coffee", 200, 50));
        drink.setDrink(new Drink("Pepsi", 500));
        hotDrink.setDrink(new HotDrink("tea", 400, 70));

        hotDrink.getDrink();
        drink.getDrink();
    }
}
