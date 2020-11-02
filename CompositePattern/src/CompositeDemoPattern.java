import java.util.Random;

public class CompositeDemoPattern {
    public static void main(String[] args) {

        Soldier General = new Soldier("Elliot", Rank.General, 100, 50);
        Soldier Major1 = new Soldier("Antonio", Rank.Major, 90, 40);
        Soldier Major2 = new Soldier("Emil", Rank.Major, 90, 40);



        for(int i = 0; i<5; i++) {
            int pick = new Random().nextInt(Names.values().length);
            Names randomName = Names.values()[pick];
            String ranName = randomName.toString();
            double rand = Math.random()+1;
            Soldier peon = new Soldier(ranName, Rank.Peon, 10, 5);
            Major1.add(peon);
            System.out.println(peon.toString());
        }
        for(int i = 5; i<10; i++) {
            int pick = new Random().nextInt(Names.values().length);
            Names randomName = Names.values()[pick];
            String ranName = randomName.toString();
            double rand = Math.random()+1;
            Soldier peon = new Soldier(ranName, Rank.Peon, 10, 5);
            System.out.println(peon.toString());
            Major2.add(peon);

        }
        General.add(Major1);
        General.add(Major2);


        System.out.println(Major1.getSubordinates());
        //Peon1.attack();
    }
}
