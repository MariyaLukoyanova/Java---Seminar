package lesson_11.Hometask.service;

import java.util.List;

import lesson_11.Hometask.model.User;

public interface UserService {

    void saveUser(User user);

    void removeUser(String user);

    void updateUser(int index, User user);

    void inDeposits(String name, Double cash);
    void outDeposits(String name, Double cash);

    List<User> getUserList();
}
