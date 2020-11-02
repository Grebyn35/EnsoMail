import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        CarFactory myCarFactory = new CarFactory();
        System.out.println("Which car do you want to buy?");
        Scanner in = new Scanner(System.in);
        String car = in.nextLine();
        if(car.equalsIgnoreCase("Volvo")) {
            myCarFactory.buildCar(Cars.Volvo).build();
        }
        else if(car.equalsIgnoreCase("Audi")){
            myCarFactory.buildCar(Cars.Audi).build();
        }
        else if(car.equalsIgnoreCase("BMW")){
            myCarFactory.buildCar(Cars.BMW).build();
        }
        else if(car.equalsIgnoreCase("Subaru")){
            myCarFactory.buildCar(Cars.Subaru).build();
        }
        else{
            System.out.println("That car is unavalible");
        }
    }
}
