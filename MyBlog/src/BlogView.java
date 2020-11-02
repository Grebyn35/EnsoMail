public class BlogView implements View{

    public void showView(User person){
        System.out.println("Name:" + person.getName());
        for(int i = 0; i< person.getBlogPostsList().size(); i++){
            System.out.println(person.getBlogPostsList().get(i));
            System.out.println("--------------------------------------");
        }
    }

}
