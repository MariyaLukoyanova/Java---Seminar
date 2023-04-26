package lesson_10.task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("Hello world");

        for (Object o: list) {
                System.out.println(o);

        }
        Animal<Cat> catAnimal = new Animal<>();
        Animal<Dog> dogAnimal = new Animal<>();
        catAnimal.setAnimal(new Cat("semyon"));
        //catAnimal.setAnimal(new Dog("bobik", 3, 10));
        dogAnimal.setAnimal(new Dog("sharik", 4 , 5));
        System.out.println(catAnimal.getInfoAboutAnimal());
        System.out.println(dogAnimal.getInfoAboutAnimal());






    }

}
