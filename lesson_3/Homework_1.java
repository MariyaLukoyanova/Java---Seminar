package lesson_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
public class Homework_1 {
    public static void main(String[] args) {
        //Если дан готовый список:
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 11));

        /*  Чтобы ввести список из консоли:
        int N = enterInt("Enter lenght");
        ArrayList<Integer> list = new ArrayList<Integer>(N);
        for (int i = 0; i < N; i++) {
            list.add(enterInt("Enter number: "));
        } 
*/
        System.out.println(list);
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) % 2 != 0){
                list.remove(j);
                j--;
            }
        }
        System.out.println(list);

    }

    public static int enterInt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        int res = 0;
        if (scan.hasNextInt()) {
            res = scan.nextInt();
        } else {
            System.out.println("It is a number! Try again!");
            scan.close();
            System.exit(0);
        }
        return res;
    }
}
