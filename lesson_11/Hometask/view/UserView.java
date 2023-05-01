package lesson_11.Hometask.view;

import lesson_11.Hometask.controller.UserController;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter accaunt code and name");
        userController.saveUser(sc.nextInt(), sc.next());
        System.out.println("Enter accaunt code and name");
        userController.saveUser(sc.nextInt(), sc.next());
        System.out.println(userController.getUserList());
        
        System.out.println("Enter name and sum entry");
        userController.inDeposits(sc.next(), sc.nextDouble());
        System.out.println(userController.getUserList());
        System.out.println("Enter name and sum deduction");
        userController.outDeposits(sc.next(), sc.nextDouble());
        System.out.println(userController.getUserList());
        
        System.out.println("Enter name to remove account");
        userController.removeUser(sc.next());
        System.out.println(userController.getUserList());

        sc.close();
    }
}
