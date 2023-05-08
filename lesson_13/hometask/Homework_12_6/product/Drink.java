package lesson_13.hometask.Homework_12_6.product;


// Класс-предшественник, который можно расширить, но не менять 

public class Drink {
    protected String name;
    protected int volume;

    public Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;

    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

@Override
    public String toString() {
        return String.format("%s, volume %d", name, volume);

    }

}
