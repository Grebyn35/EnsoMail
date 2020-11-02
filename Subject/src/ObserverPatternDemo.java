public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject = new Subject();

        Observer Hex = new HexaObserver(subject);
        Observer Octal = new OctalObserver(subject);
        Observer Binary = new BinaryObserver(subject);
        Observer Last = new LastObserver(subject);

        System.out.println("\nFirst state change: 15");
        subject.setState(15);
        subject.remove(Last);
        System.out.println("\nSecond state change: 10");
        subject.setState(10);


    }
}