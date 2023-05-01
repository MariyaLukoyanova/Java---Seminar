package lesson_11.Hometask.service;

import java.util.List;

import lesson_11.Hometask.model.User;
import lesson_11.Hometask.repository.UserRepository;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository = new UserRepository();

    @Override
    public void saveUser(User user) {
        if (user == null) {
            System.out.println("User is null!");
        }
        userRepository.saveUser(user);
    }

    @Override
    public void removeUser(String user) {
        if (user != null) {
            userRepository.removeUser(userRepository.getUser(user));
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public void updateUser(int index, User user) {
        if (user != null) {
            userRepository.updateUser(index, user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public List<User> getUserList() {
        return userRepository.getUserList();
    }

    @Override
    public void inDeposits(String name, Double cash) {
        (userRepository.getUser(name)).setDeposit(userRepository.getUser(name).getDeposit() + cash);
    }

    @Override
    public void outDeposits(String name, Double cash) {
        (userRepository.getUser(name)).setDeposit(userRepository.getUser(name).getDeposit() - cash);
    }

}