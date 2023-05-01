package lesson_11.task.service;

import lesson_11.task.model.User;
import lesson_11.task.repository.UserRepository;
import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository userRepository = new UserRepository();
    
    @Override
    public void saveUser(User user) {
        if (user == null){
            System.out.println("User is null!");
        }
        userRepository.saveUser(user);
    }

    @Override
    public void removeUser(User user) {
userRepository.removeUser(user);
    }

    @Override
    public void updateUser(int index, User user) {
        if (user == null){
            System.out.println("User is null!");
        }
        else userRepository.updateUser(index, user);
    }

    @Override
    public List<User> getUserList(){
        return userRepository.getUserList();
    }
    }
