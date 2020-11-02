import javax.xml.crypto.Data;

public class Database {
    private static String connection;


    private Database(){

    }

    public static String getConnection(){
        if(connection == null){
            System.out.println("Connected");
            return connection;
        }else{
            System.out.println("Error");
            return connection;
        }
    }
}
