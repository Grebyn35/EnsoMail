import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String option;
        Cart cart = new Cart();
        Products mjölk = new Products("Mjölk", "Gott till kaffe", 15.00);
        Products broccoli = new Products("Broccoli", "Extremt nyttigt", 15.00);
        Products bönor = new Products("Bönor", "Mycket protein", 20.00);
        Products kyckling = new Products("Kyckling", "Mycket protein", 30.00);
        Products kaffe = new Products("Kaffe", "Gör dig piggare", 20.00);
        Products chips = new Products("Chips", "Väldigt gott :)", 25.00);
        Products sallad = new Products("Isbergs sallad", "Få kolhydrter", 10.00);
        Products räkor = new Products("Räkor", "Mycket protein", 50.00);
        Products guld = new Products("Guld", "Guldvärt", 5000.00);
        do{
            ProductList();
            option = in.nextLine();
//          cart.addItem();
        }while(!option.equals("0"));


//        cart.addItem(mjölk);
//        cart.addItem(broccoli);
//        cart.addItem(bönor);
//        cart.removeItem(bönor);
//        cart.calculateTotal();
    }

    public static void ProductList(){
        System.out.println("1. Mjölk");
        System.out.println("2. Broccoli");
        System.out.println("3. Bönor");
        System.out.println("4. Kyckling");
        System.out.println("5. Kaffe");
        System.out.println("6. Chips");
        System.out.println("7. Sallad");
        System.out.println("8. Räkor");
        System.out.println("9. Guld");
        System.out.println("0. Till betalning");
    }


}

