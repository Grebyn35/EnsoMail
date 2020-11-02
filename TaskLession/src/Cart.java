import java.util.List;
import java.util.ArrayList;

public class Cart {
   List<Products> items;

   public Cart(){
       this.items = new ArrayList<Products>();
   }

   public void addItem(Products products){
       this.items.add(products);
   }

    public void removeItem(Products products){
        this.items.remove(products);
    }
    public void calculateTotal(){
       double sum = 0;
       for(Products products: items){
           sum += products.getPrice();
       }
        System.out.println(sum);
    }


}
