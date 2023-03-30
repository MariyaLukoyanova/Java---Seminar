package lesson_3;

import java.util.ArrayList;
import java.util.List;

// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
// Пример: 
// ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); 
// ["string", "s", "my_value"]
public class Homework_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (isDigit(list.get(i)) == true) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
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
