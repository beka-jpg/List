package miniProject.dao.imp;

import miniProject.dao.PostInterface;
import miniProject.module.Post;
import miniProject.module.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class PostInterfaceImp implements PostInterface {
    private Random random = new Random();
    @Override
    public ArrayList<Post> addPostToUser(ArrayList<Post> posts, String description) {
        posts.add(new Post(description, "ID" + random.nextInt(10000)));
        return posts;
    }


    @Override
    public ArrayList<Post> deletePostById(ArrayList<Post> posts, String id) {

        for (Post post : posts){
            if (post.getUniqueId().equals(id)){
                posts.remove(post);
                System.out.println("Пост успешно удалён");
            }
        }

        return posts;
    }

    @Override
    public ArrayList<Post> getAllPostByUserId(String userId, ArrayList<User> users) {
        ArrayList<Post> posts = null;

        for (User user : users){
            if (user.getUniqueId().equals(userId)){
                posts = user.getPosts();
            }

        }

        return posts;
    }
}
