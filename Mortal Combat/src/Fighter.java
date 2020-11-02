import java.util.ArrayList;
import java.util.List;

public class Fighter {

    private String name;
    private String winningMoto;
    private int health;
    private int strength;
    private double speed;
    private double crit;
    private int abilityOne;
    private int abilityTwo;
    private int abilityThree;
    private int abilityFour;
    private int attack;
    private int defend;
    int basicAttack = 5;


        public Fighter(String name, String winningMoto, int health, int strength, double speed, double crit){
        this.name = name;
        this.winningMoto = winningMoto;
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.crit = crit;
    }


    public int attack(int ability){
        this.name = name;
        if(ability == 0){
            attack = (int) (Math.random() * ((8+15) + 1));
            return attack;
        }
        else if(ability == 1){
            attack = (int) (Math.random() * ((5+20) + 1));
            return attack;
        }
        else if(ability == 2){
            attack = (int) (Math.random() * ((1+25) + 1));
            return attack;
        }
        else if(ability == 3){
            attack = (int) (Math.random() * ((10+13) + 1));
            return attack;
        }
        else{
            return basicAttack;
        }
    }
    public int defend(){
        this.health = health + 10;
        return defend;
    }
    public void setname(Fighter e){
        this.name = name;
    }
    public String name(){
        return name;
    }
    public void updateName(String updateName){
            name = updateName;
    }
    public void updateWinningMoto(String updateWinningMoto){
        winningMoto = updateWinningMoto;
    }
    public void getWinningMoto(Fighter e){
        this.winningMoto = winningMoto;
    }
    public String winningMoto(){
        return winningMoto;
    }
    public void getHealth(Fighter e){
        this.health = health;
    }
    public int health(){
        return health;
    }
    public void getStrength(Fighter e){
        this.strength = strength;
    }
    public int strength(){
        return strength;
    }
    public void getSpeed(Fighter e){
        this.speed = speed;
    }
    public double speed(){
        return speed;
    }
    public void getPower(Fighter e){
        this.crit = crit;
    }
    public double power(){
        return crit;
    }
    public String toString(){
        return "name: " + name + "\n \twinning moto: " + winningMoto + "\n \thealth: " + health + "\n \tstrenght: " + strength + "\n \tspeed: " + speed + "\n \tcrit: " + crit;
    }
    public int randomInt(){
            int n = (int) (Math.random() * ((4-0)));
            return n;
    }


}
