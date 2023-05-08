package lesson_13.hometask.Homework_12_6.product;

// Дабавляем новый класс-наследник не изменяя реализацию класса-предшественника

public class Cocktail extends Drink{
private double abv;

    public Cocktail(String name, int volume, double abv) {
        super(name, volume);
        this.abv = abv;
    }

    public double getABV() {
        return abv;
    }

    public void setABV(double abv) {
        this.abv = abv;
    }   
   
    @Override
    public String toString() {
        return String.format("%s, volume %d, Alcohol %s", name, volume, abv);

    }

}
