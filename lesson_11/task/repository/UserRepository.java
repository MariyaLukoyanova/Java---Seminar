package lesson_11.task.repository;

import java.util.ArrayList;
import java.util.List;

import lesson_11.task.model.User;

// import java.io.FileWriter;


public class UserRepository {
    

    // public void removeUser(User user){
    //     try(FileWriter fileWriter = new FileWriter("users.txt", true)){
    //         fileWriter.write(user.toString());

    //     }catch (Exception e){
    //         System.out.println("error in repo");
    //     }
    // }
    
    List<User> userList = new ArrayList<>();

    public void saveUser(User user){
        userList.add(user);
    }

    public void removeUser(User user){
userList.remove(user);
    }

    public void updateUser(int index, User user){
    userList.set(index, user);
    }

    public List<User> getUserList(){
       return userList;
    }

}