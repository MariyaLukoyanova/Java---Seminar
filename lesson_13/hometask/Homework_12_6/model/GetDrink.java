package lesson_13.hometask.Homework_12_6.model;

public class GetDrink implements InterfaceGetDrink{

// Класс реализует необходимый ему интерфейс
// Разделение классов - у каждого своя одна зона отвественности 

    @Override
    public void getDrink(){
        System.out.println("Get your order");
    }
    
}
