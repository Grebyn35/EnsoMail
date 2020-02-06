public class CompositeDemoPattern {
    public static void main(String[] args) {

        Soldier General = new Soldier("Elliot", Rank.General);
        Soldier Major1 = new Soldier("Antonio", Rank.Major);
        Soldier Major2 = new Soldier("Tyrion", Rank.Major);

        Soldier Peon1 = new Soldier("Vikke", Rank.Peon);
        Soldier Peon2 = new Soldier("Makke", Rank.Peon);
        Soldier Peon3 = new Soldier("Valter", Rank.Peon);
        Soldier Peon4 = new Soldier("Admir", Rank.Peon);
        Soldier Peon5 = new Soldier("Frodo", Rank.Peon);
        Soldier Peon6 = new Soldier("Jamie Lannister", Rank.Peon);

        General.add(Major1);
        General.add(Major2);
        Major1.add(Peon1);
        Major1.add(Peon2);
        Major1.add(Peon3);
        Major2.add(Peon4);
        Major2.add(Peon5);
        Major2.add(Peon6);

        System.out.println(General.toString());
        System.out.println(General.getSubordinates());
        Peon1.attack();
    }
}
