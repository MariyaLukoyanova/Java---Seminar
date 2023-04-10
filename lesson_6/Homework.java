package lesson_6;

/* Создать класс Person.
У класса должны быть поля:
1. Имя (String)
2. Фамилия (String)
3. Возраст (продумать тип)
4. Пол
5*. Придумать свои собственные поля

Для этого класса
1. Реализовать методы toString, equals и hashCode.
2*. Придумать собственные методы и реализовать их

В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.*/

public class Homework {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Вася";
        p1.surname = "Пупкин";
        p1.age = 40;
        p1.sex = "муж";
        p1.family = "не женат";
        p1.id = 0001;

        Person p2 = new Person();
        p2.name = "Груня";
        p2.surname = "Пинкин";
        p2.age = 32;
        p2.sex = "муж";
        p2.family = "женат";
        p2.id = 0002;

        Person p3 = new Person();
        p3.name = "Тася";
        p3.surname = "Тряпка";
        p3.age = 28;
        p3.sex = "жен";
        p3.family = "замужем";
        p3.id = 0003;

        Person p4 = new Person();
        p4.name = "Вася";
        p4.surname = "Пупкин";
        p4.age = 40;
        p4.sex = "муж";
        p4.family = "не женат";
        p4.id = 0001;

        Person p5 = new Person();
        p5.name = "Гунтер";
        p5.surname = "Шрим";
        p5.age = 18;
        p5.sex = "муж";
        p5.family = "женат";
        p5.id = 0005;

        Person p6 = new Person();
        p6.name = "Грета";
        p6.surname = "Шрим";
        p6.age = 18;
        p6.sex = "жен";
        p6.family = "замужем";
        p6.id = 0006;


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));        

Object[] pers = {p1, p2, p3, p4, p5, p6};
for (Object ob : pers) {
    if (((Person) ob).age < 20) System.out.println(ob.toString());
}

    }
}
