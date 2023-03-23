package lesson_1;
/* Напишите метод, который находит самую длинную строку общего префикса 
среди массива строк. Если общего префикса нет, вернуть пустую строку "".
*/

//import java.util.Arrays;

public class Tak_3 {

    public static void main(String[] args) {
        String[] array = { "abkkkkkkkkkkk", "abcssssss", "abgggg", "abceee" };
        String common = findCommon(array);
        System.out.println(common);

    }

    static String findCommon(String[] array) {
        String result = "";
        int min = array[0].length();
        for (String string : array) {
            if (string.length() < min) min = string.length();            
        }
        for (int i = 0; i < min; i++) {
            for (String item : array) {
                if (array[0].charAt(i) != item.charAt(i))
                    return result;    
                }
                result += array[0].charAt(i);
        }
        return result;
    }
}
