public class Main {
    public static void main(String[] args){
        Dog Ivar = new Dog( 5);
        Ivar.info();

        System.out.println("-------------------------");

        Gnu Olle = new Gnu(10);
        Olle.info();

        System.out.println("-------------------------");

        BMW BMW = new BMW();
        BMW.info();

        System.out.println("-------------------------");

        Toyota Toyota = new Toyota();
        Toyota.info();
    }
}
