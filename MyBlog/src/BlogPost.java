public class BlogPost {

    private String title;
    private String body;

    public BlogPost(String title, String body){
        this.title = title;
        this.body = body;

    }

    public String toString(){
        return "Title: " + title + "\nBody: " + body;
    }
}
