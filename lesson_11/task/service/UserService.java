package lesson_11.task.service;

import java.util.List;

import lesson_11.task.model.User;

public interface UserService {
     void saveUser(User user);
     void removeUser(User user);
     void updateUser(int index, User user);
     List<User> getUserList();
}
