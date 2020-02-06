import javax.swing.Action;
import java.util.ArrayList;
import java.util.List;

public class Soldier {

    private String name;
    private  Rank rank;
    private int health;
    private int attackdmg;
    private List<Soldier>subordinates;

    public Soldier(String name, Rank rank, int health, int attackdmg) {
        this.name = name;
        this.rank = rank;
        this.health = health;
        this.attackdmg = attackdmg;
        subordinates = new ArrayList<Soldier>();
    }
        public void add(Soldier e) {
            subordinates.add(e);
        }

        public Rank getRank(){
        return rank;
        }


        public void attack(){
        switch(this.rank){
            case Peon:
                System.out.println("I will attack for the Major!!");
                break;
            case Major:
                System.out.println("I will attack for the General!!");
                break;
            case General:
                System.out.println("I will not attack, my peons will!!");
                break;
            default:
                break;
        }
        }

        public void defend(){
        switch(this.rank){
            case Peon:
                System.out.println("I will defend myself with the shield!!");
                break;
            case Major:
                System.out.println("I will defend myself with the help of my peons!!");
                break;
            case General:
                System.out.println("I will be defended by my army!!");
                break;
            default:
                break;
            }
        }

        public void remove(Soldier e){
            subordinates.remove(e);
        }
    public int getHealth(){
        return health;
    }
    public int getAttackdmg(){
            return attackdmg;
    }

        public List<Soldier> getSubordinates(){
            return subordinates;
        }

        public String toString(){
        return ("Soldier name: " + name + " Rank: " + rank + "\n \t -Health " + health + " \n \t -Attack damage: " + attackdmg);
        }

    }

