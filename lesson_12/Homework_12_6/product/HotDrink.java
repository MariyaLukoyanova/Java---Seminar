package lesson_12.Homework_12_6.product;

public class HotDrink extends Drink{
private int temperature;

public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }   
   
    @Override
    public String toString() {
        return String.format("%s, volume %d, temperature %d", name, volume, temperature);

    }

}
