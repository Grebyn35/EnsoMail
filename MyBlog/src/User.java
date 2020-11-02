import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<BlogPost> blogPostsList;
    public static List<User> Users = new ArrayList<User>();
    private List<User> Friends = new ArrayList<User>();

    public User(String name){
    this.name = name;
    this.blogPostsList = new ArrayList<BlogPost>();
    Users.add(this);
    }

    public void addBlogPost(String title, String desc){
        BlogPost day = new BlogPost(title, desc);
        blogPostsList.add(day);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public List<BlogPost> getBlogPostsList() {
        return blogPostsList;
    }

    public String toString(){
        return name;
    }
    public static List<User> getUser(){
        return Users;
    }
    public void addFriends(User person){
        this.Friends.add(person);
        person.Friends.add(this);
    }
    public List<User>getFriends(){
        System.out.println(name + "'s Friendslist: " + Friends.toString());
        return Friends;
    }
    public void removeFriends(User person){
        this.Friends.remove(person);
        person.Friends.remove(this);
    }
}
