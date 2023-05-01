package lesson_11.task.controller;

import lesson_11.task.model.User;
import lesson_11.task.service.UserService;
import lesson_11.task.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();
    
    public void saveUser(String name, int age){
        userService.saveUser(new User(name, age));
    }
    
    public void removeUser(User user){
        userService.removeUser(user);
    }
    
    public void updateUser(int index, String name, int age){
        userService.updateUser(index, new User(name, age));
    }
    
    public List<User> getUserList(){
        return userService.getUserList();
    }
    
}