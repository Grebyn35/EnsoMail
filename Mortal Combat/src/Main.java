public class Main {
    public static Fighter  fighter;
    public static Match match;
    public static TournamentController matchController;
    public static Combat combat;
    public static Fighter winner;

    public static void main(String[] args) throws InterruptedException {
        start();
    }

    public static void start() throws InterruptedException {
        matchController = new TournamentController();
        combat = new Combat();
        matchController.createFinal();

    }

}
