package lesson_11.task.view;

import java.util.Scanner;

import lesson_11.task.model.User;
import lesson_11.task.controller.UserController;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your data");
        userController.saveUser(scanner.nextLine(), scanner.nextInt());

        int i = 0;
        for (User user : userController.getUserList()) {
            System.out.printf("index: %d %s", i, user);
            i++;
            System.out.println();
        }
        System.out.println("enter index to remove");
        i = scanner.nextInt();
        userController.removeUser(userController.getUserList().get(i));
    scanner.close();
    
    }

}
