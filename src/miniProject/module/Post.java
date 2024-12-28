package miniProject.module;

import javax.swing.*;

public class Post {
    private String uniqueId;
    private String description;

    public Post(String description, String uniqueId) {
        this.description = description;
        this.uniqueId = uniqueId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "description='" + description + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                '}';
    }
}
