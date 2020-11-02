public class UserView implements View {


    @Override
    public void showView(User person) {
        System.out.println("Name:" + person.getName());
        System.out.println("Antal posts:" + person.getBlogPostsList().size());
        System.out.println("--------------------------------------");
    }
}
