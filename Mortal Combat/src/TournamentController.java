import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TournamentController{
    private Match match;
    private List<Fighter> fighters = new ArrayList<Fighter>();
    private List<Match> matchGroups = new ArrayList<Match>();
    private List<Match> matchQuartersOne = new ArrayList<Match>();
    private List<Match> matchQuartersTwo = new ArrayList<Match>();
    private List<Match> matchSemiFinals = new ArrayList<Match>();
    private List<Match> matchFinals = new ArrayList<Match>();
    private Combat combat;
    private Fighter winner;
    private Interface interF;

    public TournamentController(){

    }
    public Fighter createFighters() {

            int pick = new Random().nextInt(FighterNames.values().length);
            FighterNames randomName = FighterNames.values()[pick];
            String ranName = randomName.toString();
            double rand = Math.random()+1;

            int pick1 = new Random().nextInt(WinningMotos.values().length);
            WinningMotos randomMoto = WinningMotos.values()[pick];
            String ranMoto = randomMoto.toString();
            double random = Math.random()+1;

            Fighter fighterMan = new Fighter(ranName, ranMoto, health(), strength(), speed(), crit());
        return fighterMan;
    }
    public void addFighter(Fighter fighter){
        this.fighters.add(fighter);
    }
    public List<Fighter> getFighters(){
        return fighters;
    }

    public List<Match> getMatchGroups(){
        return matchGroups;
    }
    public List<Match> getMatchQuartersOne(){
        return matchQuartersOne;
    }
    public List<Match> getMatchQuartersTwo(){
        return matchQuartersTwo;
    }
    public List<Match> getMatchSemi(){
        return matchSemiFinals;
    }
    public List<Match> getMatchFinal(){
        return matchFinals;
    }


    public void createGroups() {
            for (int i = 1; i < 8; i ++) {
                createFighters();
                Match match = new Match(createFighters(), createFighters());
                matchGroups.add(match);
            }
           showRoster(matchGroups);

    }
    public void createQuarters() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        createGroups();
        combat = new Combat();

        /*System.out.println("Do you want to create new fighter?\ny/n");
        String answer = in.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.out.println("name: ");
            String name = in.nextLine();
            System.out.println("winning moto: ");
            String winningMoto = in.nextLine();
            interF.updateFighter(name, winningMoto, getMatchGroups().get(0).getFighterOne());
        }*/
        Match matchQuarterOne = new Match(combat.playerFight(getMatchGroups().get(0)), combat.botFight(getMatchGroups().get(1)));
        matchQuartersOne.add(matchQuarterOne);
        for (int i = 1; i < 4; i ++) {
                Match matchQuarterTwo = new Match(combat.botFight(getMatchGroups().get(i)), combat.botFight(getMatchGroups().get(i+2)));
                matchQuartersOne.add(matchQuarterTwo);
        }
        showRoster(matchQuartersOne);

    }

    public void createSemi() throws InterruptedException {
        createQuarters();
        combat = new Combat();
                Match matchSemiOne = new Match(combat.playerFight(getMatchQuartersOne().get(0)), combat.botFight(getMatchQuartersOne().get(1)));
                Match matchSemiTwo = new Match(combat.botFight(getMatchQuartersOne().get(2)), combat.botFight(getMatchQuartersOne().get(3)));
                matchSemiFinals.add(matchSemiOne);
                matchSemiFinals.add(matchSemiTwo);
                showRoster(matchSemiFinals);
    }
    public Fighter createFinal() throws InterruptedException {
        createSemi();
        combat = new Combat();
        Match matchFinal = new Match(combat.playerFight(getMatchSemi().get(0)), combat.botFight(getMatchSemi().get(1)));
        matchFinals.add(matchFinal);
        winner = combat.playerFight(matchFinal);
        System.out.println("WINNER OF TOURNAMENT IS " + winner.name());
            return winner;
    }
    public Fighter winner() throws InterruptedException {
        combat = new Combat();
        winner = createFinal();
        gameWinner(winner);
        return winner;
    }



    public Fighter getFighterOne(){
        return match.getFighterOne();
    }
    public Fighter getFighterTwo(){
        return match.getFighterTwo();
    }
    public int health(){
        int health = (int) (Math.random() * 120 + 80);
        return health;
    }
    public int strength(){
        int strength = (int) (Math.random() * 2 + 1);
        return strength;
    }
    public double speed(){
        double speed = (double) (Math.random() * 60 + 30);
        return speed;
    }
    public double crit(){
        double crit = (double) (Math.random() * 50 + 10);
        return crit;
    }

    public void showRoster(List<Match> matches){
        System.out.format("+___________CHALLENGERS__________+%n");
        matches.forEach(match -> System.out.format("|___    %-20s  ___|%n", match));
        System.out.format("+________________________________+%n");
        //matches.forEach(match -> System.out.printf("\t |" + match + "|%n" + "\n\t+----------------------+%n"));
    }
    public void gameWinner(Fighter winner){
        System.out.format("+_____________WINNER_____________+%n");
        System.out.format("|___    %-20s  ___|%n", winner);
        System.out.format("+________________________________+%n");
    }


}
