package lesson_7.Hometask_7_1;

public class HotDrink extends Drink {
protected int temperature;




    HotDrink(String name, int volume, int temp) {
        super(name, volume);
        this.temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }
   

}
