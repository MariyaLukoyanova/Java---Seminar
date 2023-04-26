package lesson_10.Hometask;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    protected String name;
    protected int volume;

    List<Drink> drink = new ArrayList<>();

    Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;
        drink.add(this);
    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String toString() {
        return String.format("%s, volume %d", name, volume);

    }

}
