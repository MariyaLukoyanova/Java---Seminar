package lesson_6;

import java.util.Objects;

public class Cat {
    
    String name; // Поле класса
    int age;

     
Cat(String name, int age) //Конструктор 
{
    this.name = name; // this это ссылка на текущий объект
    this.age = age;
}

// Чтобы получить значения
// Метод класса
public String getName(){
    return name;
}


@Override 
public String toString() {
    return String.format("%s [%d]", name, age);
}

@Override
public boolean equals(Object obj) {
    if (obj == null)
    {return false;}
    if (obj instanceof Cat) // Проверяет что объект относится к классу
    {return false;}

Cat c = (Cat) obj;
    return Objects.equals(name, c.name) && c.age == age;
}

@Override
public int hashCode() {
    // Если объекты идентичны, должен быть одинаковый хэшкод
    // Наоборот не обязательно выполняется т.к. кол-во целых чисел ограничено
    return Objects.hash(name, age);
}

}
