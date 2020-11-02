import java.util.ArrayList;
import java.util.List;

public class UserController {

    private User model;
    private View view;



    public UserController(User model, View view){
        this.model = model;
        this.view = view;

    }
    public void setUserName(String name){
        model.setName(name);
    }
    public void setName(String name){
        this.model.setName(name);
    }
    public String getName(){

        return model.getName();
    }
    public void updateUser(){

        view.showView(model);
    }

    public void removeFriends(User person){
        model.removeFriends(person);
        person.removeFriends(model);
    }
    public List<BlogPost> getBlogPostsList() {

        return model.getBlogPostsList();
    }
    public void addBlogPost(String title, String desc){
        BlogPost day = new BlogPost(title, desc);
        model.getBlogPostsList().add(day);
    }
    public void addFriends(User person){
        model.getFriends().add(person);
        person.getFriends().add(model);
    }
    public void getFriends(){
        model.getFriends();
    }

    public void changeUser(){

    }
}
