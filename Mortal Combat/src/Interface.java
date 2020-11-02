public class Interface implements Observer{
    private String name;
    private String winningMoto;

    @Override
    public void updateFighter(String name, String winningMoto, Fighter e) {
        e.updateName(name);
        e.updateWinningMoto(winningMoto);
    }
}
