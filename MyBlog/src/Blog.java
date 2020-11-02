public class Blog {
    public static UserController loggedInUser;
    public static void main(String[] args) {

        Database.getConnection();

        User person1 = new User("Elliot");
        User person2 = new User("Emil");


        View myBlogView = new BlogView();
        View myUserView = new UserView();


        System.out.println("Users: "+ User.Users.size());
        System.out.println(User.getUser());

        loggedInUser = new UserController(person2, myUserView);
        UserController loggedInUser1 = new UserController(person2, myBlogView);

        loggedInUser.addBlogPost("Minecon", "MINECON ÄR BÄST!!");
        loggedInUser.addBlogPost("Minecraft", "MINECRAFT ÄR SÄMST!!");
        loggedInUser.addFriends(person1);
        loggedInUser.updateUser();
        loggedInUser1.updateUser();
        loggedInUser.getFriends();



    }

}
