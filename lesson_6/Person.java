package lesson_6;

import java.util.Objects;

public class Person {
    String name;
    String surname;
    Integer age;
    String sex;
    Integer id;
    String family;


    @Override
    public String toString() {
        return String.format("id: %d   Имя: %s   Фамилия: %s   Возраст: %d   Пол: %s   Семейное положение: %s", id, name, surname, age, sex, family);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {return false;}
        if (!(obj instanceof Person))
        {return false;}
        Person p = (Person) obj;
        return id == p.id && Objects.equals(surname, p.surname) && Objects.equals(name, p.name) && Objects.equals(sex, p.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }


   
}

