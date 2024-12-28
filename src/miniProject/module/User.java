package miniProject.module;

import java.util.ArrayList;

public class User {
    private String uniqueId;
    private String email;
    private String password;
    private String fullName;
    private boolean gender;
    private ArrayList<Post> posts;

    public User(String email, String fullName, boolean gender, String password, String uniqueId, ArrayList<Post> posts) {
        this.email = email;
        this.fullName = fullName;
        this.gender = gender;
        this.password = password;
        this.uniqueId = uniqueId;
        this.posts = posts;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
