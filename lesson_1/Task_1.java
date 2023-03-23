package lesson_1;

/**
 * Task_1
 * Дан массив чисел, вывести максимально количество подряд идущих 1.
 */
public class Task_1 {

    public static void main(String[] args) {
        int[] x = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int item : x) {
            if (item == 1)
                count++;
            else {
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}
