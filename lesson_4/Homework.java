package lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

/* Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список 
на позицию num.
3. Если введено print~num, выводит строку из позиции num в связном списке.
4. Если введено exit, завершаем программу*/

// СОХРАНИТЬ В СВЯЗАННЫЙ СПИСОК

public class Homework {
    public static void main(String[] args) {
        LinkedList<String> dict = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter 'text~number' for addition text in dictionale");
        System.out.println("Enter 'print~number' print required");
        System.out.println("Enter 'exit' for stop");
        while ((str = scan.nextLine()).equals("exit") == false) {
            if (str.contains("~") == true) {
                String[] arg = str.split("~");
                if (isDigit(arg[1]) == true) {
                    if (Integer.parseInt(arg[1].trim()) > 0){ 
                    
                    if ((isDigit(arg[1]) == true) && (arg[0].equals("print") == false)) {
                        if (dict.size() <= Integer.parseInt(arg[1].trim())) {
                            for (int i = dict.size(); i < Integer.parseInt(arg[1].trim()) + 1; i++) {
                                dict.addLast("null");
                            }
                        }
                        dict.set(Integer.parseInt(arg[1].trim()), arg[0]);
                    } else {
                        if ((isDigit(arg[1]) == true) && (arg[0].equals("print"))
                                && (dict.size() > Integer.parseInt(arg[1].trim())))
                            System.out.println(dict.get(Integer.parseInt(arg[1].trim())));
                        else
                            System.out.println("Incorrect index!");
                    }
                } else System.out.println("Incorrect index! Index >= 0!");
                } else System.out.println("Try again and enter a number after ~!");
            } else
                System.out.println("Incorrect! Try again with ~");
        }scan.close();

    }

    private static Boolean isDigit(String str) {
        try {
            Integer.parseInt(str.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
