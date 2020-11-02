import java.util.Scanner;

public class CarFactory {


    public static Car buildCar(Cars carType) {
        switch (carType) {
            case Volvo:
                return new Volvo();
            case BMW:
                return new BMW();
            case Audi:
                 return new Audi();
            case Subaru:
                return new Subaru();
            default:
        }
        return null;
    }
}
