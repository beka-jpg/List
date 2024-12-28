package miniProject.dao.imp;

import miniProject.dao.UserInterface;
import miniProject.module.Post;
import miniProject.module.User;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

public class UserInterfaceImp implements UserInterface {
    private Random random = new Random();

    @Override
    public ArrayList<User> register(ArrayList<User> users, String email, String fullName, String password, boolean gender) {

        users.add(new User(email, fullName, gender, password, "ID" + random.nextInt(10000), new ArrayList<Post>()) );

        System.out.println(fullName + " Вы успешно зарегистировались");

        return users;
    }

    @Override
    public User login(ArrayList<User> users, String email, String password, String fullName) {
        User user = null;
        for (User value : users) {
            if (value.getEmail().equals(email) &&
                    value.getPassword().equals(password) &&
                    value.getFullName().equals(fullName)
            ) {
                user = value;
                System.out.println(value.getFullName() + "Вы успешно зашли");
            }
        }
        return user;
        // Если возврашает null то в маине показывеем что такого нету
    }

    @Override
    public User getUserByEmail(String email, ArrayList<User> users) {
        User user = null;

        for (User value : users){
            if (value.getEmail().equals(email)){
                user =  value;
            }
        }


        return user;
    }

    @Override
    public ArrayList<User> getAllUsers(ArrayList<User> users) {
        return null;
    }
}
