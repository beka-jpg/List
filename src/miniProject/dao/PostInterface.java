package miniProject.dao;

import miniProject.module.Post;
import miniProject.module.User;

import javax.swing.*;
import java.util.ArrayList;

public interface PostInterface {
    ArrayList<Post> addPostToUser(ArrayList<Post> posts, String description);
    ArrayList<Post> deletePostById(ArrayList<Post> posts , String id);
    ArrayList<Post> getAllPostByUserId(String userId, ArrayList<User> users);
}
