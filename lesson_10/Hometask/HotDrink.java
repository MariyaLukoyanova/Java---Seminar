package lesson_10.Hometask;

public class HotDrink{
private int temperature;
private int volume;
private String name;



HotDrink(String name, int volume, int temperature) {
    this.name = name;
    this.volume = volume;
    this.temperature = temperature;
}

    public int getTemperature() {
        return temperature;
    }
   
    public String toString() {
        return String.format("%s, volume %d, temperature %d", name, volume, temperature);

    }

}
