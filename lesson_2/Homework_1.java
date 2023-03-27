package lesson_2;

import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, 
// начиная с c1. (6, 'a', 'b') -> "ababab"

public class Homework_1 {

    public static void main(String[] args) {

        int N = enterInt("Enter N: ");
        
        while (N <= 0 || N % 2 != 0) {
            N = enterInt("N > 0 and being exactly dividable by 2! Enter N again:");
        }

        Scanner iscan = new Scanner(System.in);
        System.out.println("Enter c1:");
        char c1 = iscan.next().charAt(0);
        System.out.println("Enter c2:");
        char c2 = iscan.next().charAt(0);
        iscan.close();
        System.out.println(buildString(N, c1, c2));

    }

    static String buildString(int n, char c1, char c2) {
        String result = "";
        for (int i = 0; i < n / 2; i++) {
            result += String.valueOf(c1) + String.valueOf(c2);
        }
        return result;
    }

    public static int enterInt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        int res = 0;
        if (scan.hasNextInt()) {
            res = scan.nextInt();    
        } else {
            System.out.println("N is a number! Try again!");
            scan.close(); 
            System.exit(0);
        }
        return res;
    }
}
