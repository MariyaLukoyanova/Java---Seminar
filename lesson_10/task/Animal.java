package lesson_10.task;

public class Animal<T extends BasicAnimal> {
//<T extends BasicAnimal> т.е. неизвестный тип Т наследник BasicAnimal 

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }
    public T getInfoAboutAnimal(){
        return animal;

    }
}
