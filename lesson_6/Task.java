package lesson_6;

public class Task {
    public static void main(String[] args) {
        // Вызвали конструктор и передали ему аргументы
        Cat cat = new Cat("Murzik", 5);
        Cat cat1 = new Cat("Murzik", 5);

        System.out.println(cat.getName());
        System.out.println(cat.name);
        System.out.println(cat.toString());
        System.out.println(cat.equals(cat1));

        
    }
}
