import javax.swing.Action;
import java.util.ArrayList;
import java.util.List;

public class Soldier {

    private String name;
    private  Rank rank;
    private List<Soldier>subordinates;

    public Soldier(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
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
                System.out.println("I will die for the Major!!");
                break;
            case Major:
                System.out.println("I will die for the General!!");
                break;
            case General:
                System.out.println("I will not die!!");
                break;
            default:
                break;
        }
        }

/*        public void defend(){
        switch(){

            }
        }*/

        public void remove(Soldier e){
            subordinates.remove(e);
        }

        public List<Soldier> getSubordinates(){
            return subordinates;
        }

        public String toString(){
        return ("Soldier name: " + name + " rank: " + rank);
        }
    }

