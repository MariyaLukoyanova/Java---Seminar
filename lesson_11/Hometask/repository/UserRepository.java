package lesson_11.Hometask.repository;

import lesson_11.Hometask.model.User;
import java.util.ArrayList;
import java.util.List;


public class UserRepository {
    List<User> BankUser = new ArrayList<>();

    public void saveUser(User user) {
        if (user == null) System.out.println("User is null!");
        else BankUser.add(user);
    }

    public void removeUser(User user) {
        System.out.println("remove user");
        BankUser.remove(user);
    }

    public void updateUser(int index, User user) {
        BankUser.set(index, user);
    }

    public List<User> getUserList() {
        return BankUser;
    }

    public User getUser(String name) {
        for (User user : BankUser) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
    
}