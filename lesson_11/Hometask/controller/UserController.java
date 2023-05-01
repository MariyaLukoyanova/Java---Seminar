package lesson_11.Hometask.controller;

import java.util.List;


import lesson_11.Hometask.model.User;
import lesson_11.Hometask.service.UserService;
import lesson_11.Hometask.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(int numDeposit, String name) {
        userService.saveUser(new User(numDeposit, name));
    }

    public void removeUser(String user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }

    public void inDeposits(String name, Double cash) {
        userService.inDeposits(name, cash);
    }

    public void outDeposits(String name, Double cash) {
        userService.outDeposits(name, cash);
    }
}
