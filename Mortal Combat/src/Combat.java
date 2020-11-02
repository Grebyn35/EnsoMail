import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Combat {

    private Fighter winner;
    private Fighter fighterOne;
    private Fighter fighterTwo;
    private Match model;
    private TournamentController matchController;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public Fighter playerFight(Match e) throws InterruptedException {
        int a = 0;
        int b = 0;
        Scanner in = new Scanner(System.in);
        Fighter fighterOne = e.getFighterOne();
        Fighter fighterTwo = e.getFighterTwo();
        System.out.println("Press enter to start game");
        in.nextLine();
        System.out.println("-------------------------------------------");
        System.out.println(fighterOne+"\n-------------------------------------------");
        System.out.println(fighterTwo+"\n-------------------------------------------\n");
        for(int i = 1; i<4; i++) {
            System.out.println("Press enter to start round "+ i);
            in.nextLine();
            System.out.println("round starting in 3...");
            Thread.sleep(1000);
            System.out.println("round starting in 2...");
            Thread.sleep(1000);
            System.out.println("round starting in 1...\n");
            Thread.sleep(1000);
            int playerOneHealth = playerHealth();
            int playerTwoHealth = fighterTwo.health();
            /*if(fighterOne.name().contains("Antonio")){
                playerOneHealth = 1000;
            }else if(fighterTwo.name().contains("Antonio")){
                playerTwoHealth = 1000;
            }*/

            while (playerOneHealth >= 0 & playerTwoHealth >= 0) {
                int nFighterOne = (int) (Math.random() * ((4-0)));
                int nFighterTwo = (int) (Math.random() * ((4-0)));
                if (fighterOne.speed() > fighterTwo.speed()) {
                    playerOneHealth = playerOneHealth - fighterTwo.attack(nFighterTwo) * fighterTwo.strength();
                    switchCaseAbility(fighterOne, nFighterOne);
                    playerTwoHealth = playerTwoHealth - fighterOne.attack(nFighterOne) * fighterOne.strength();
                    switchCaseAbility(fighterTwo, nFighterTwo);

                    System.out.println(fighterOne.name() + " health: " +ANSI_RED + playerOneHealth + ANSI_RESET);
                    System.out.println(fighterTwo.name() + " health: " +ANSI_RED + playerTwoHealth + ANSI_RESET);
                    Thread.sleep(1000);

                } else {
                    ThreadLocalRandom.current();
                    playerTwoHealth = playerTwoHealth - fighterOne.attack(nFighterOne) * fighterOne.strength();
                    switchCaseAbility(fighterTwo, nFighterTwo);
                    playerOneHealth = playerOneHealth - fighterTwo.attack(nFighterTwo) * fighterTwo.strength();
                    switchCaseAbility(fighterOne, nFighterTwo);

                    System.out.println(fighterOne.name() + " health: " +ANSI_RED + playerOneHealth + ANSI_RESET);
                    System.out.println(fighterTwo.name() + " health: " +ANSI_RED + playerTwoHealth + ANSI_RESET);
                    Thread.sleep(1000);

                }
                System.out.println("-------------------------------------------");
            }
            if(playerOneHealth>playerTwoHealth){
                System.out.println("Winner of round " + i + " " + fighterOne.name());
                System.out.println(fighterOne.winningMoto());
                a++;
                if(a == 2){
                    winner = fighterOne;
                    break;
                }
            }
            else{
                System.out.println("Winner of round " + i + " " + fighterTwo.name());
                System.out.println(fighterTwo.winningMoto());
                System.out.println("_______________________________\n");
                b++;
                if(b == 2){
                    winner = fighterTwo;
                    break;
                }
            }
        }
        if(a>b){
            winner = fighterOne;
            return winner;
        }
        else{
            winner = fighterTwo;
            return winner;
        }
    }


    public Fighter botFight(Match e){
        int a = 0;
        int b = 0;
        Fighter fighterOne = e.getFighterOne();
            Fighter fighterTwo = e.getFighterTwo();

            for (int i = 1; i < 4; i++) {

                int playerOneHealth = fighterOne.health();
                int playerTwoHealth = fighterTwo.health();
                while (playerOneHealth >= 0 & playerTwoHealth >= 0) {
                    int n = (int) (Math.random() * ((4-0)));
                    if (fighterOne.speed() > fighterTwo.speed()) {
                        playerOneHealth = playerOneHealth - fighterTwo.attack(n) * fighterTwo.strength();
                        playerTwoHealth = playerTwoHealth - fighterOne.attack(n) * fighterOne.strength();
                    } else {
                        playerTwoHealth = playerTwoHealth - fighterOne.attack(n) * fighterOne.strength();
                        playerOneHealth = playerOneHealth - fighterTwo.attack(n) * fighterTwo.strength();
                    }
                }
                if (playerOneHealth > playerTwoHealth) {
                    a++;
                } else {
                    b++;
                }
            }
        if(a>b){
            winner = fighterOne;
            return winner;
        }
        else{
            winner = fighterTwo;
            return winner;
        }
    }
    public int playerHealth(){
        return 150;
    }
    public int randomAbility(){
        int rand = (int) (Math.random() * ((4-0)));
        return rand;
    }
    public void switchCaseAbility(Fighter f, int e){
        switch (e){
            case 0:
                System.out.println(f.name() + " attacked with" + ANSI_GREEN + " headknock"+ ANSI_RESET+" dealing "+ANSI_BLUE+ f.attack(e) + ANSI_RESET+ " damage");
                break;
            case 1:
                System.out.println(f.name() + " attacked with" + ANSI_GREEN +" punch"+ ANSI_RESET+" dealing "+ANSI_BLUE+ f.attack(e) + ANSI_RESET+" damage");
                break;
            case 2:
                System.out.println(f.name() + " attacked with" + ANSI_GREEN +" kick"+ ANSI_RESET+" dealing "+ANSI_BLUE+ f.attack(e) + ANSI_RESET+ " damage");
                break;
            case 3:
                System.out.println(f.name() + " attacked with" + ANSI_GREEN + " spit"+ ANSI_RESET+" dealing "+ANSI_BLUE+ f.attack(e) + ANSI_RESET+ " damage");
                break;
        }
    }

}
