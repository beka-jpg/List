package miniProject.dao;

import miniProject.module.User;

import java.util.ArrayList;

public interface UserInterface {

    ArrayList<User> register(ArrayList<User> users, String email, String fullName, String password, boolean gender);
    User login(ArrayList<User> users, String email, String password, String fullName);

    User getUserByEmail(String email , ArrayList<User>  users);
    ArrayList<User> getAllUsers(ArrayList<User> users);

}
