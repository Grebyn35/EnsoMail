import java.util.ArrayList;
import java.util.List;

public class Products {
    private String name;
    private String desc;
    private Double price;



    public Products(String name, String desc, Double price){
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public Double getPrice(){
        return price;
    }

}
