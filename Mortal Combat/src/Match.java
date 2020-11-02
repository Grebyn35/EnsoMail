public class Match {

    private Fighter fighterPlaceOne;
    private Fighter fighterPlaceTwo;
    private Fighter fighter;
    private Combat combat;

    public Match(Fighter fighterPlaceOne, Fighter fighterPlaceTwo){
        this.fighterPlaceOne = fighterPlaceOne;
        this.fighterPlaceTwo = fighterPlaceTwo;
    }
    public void setFighterPlaceOne(Match e){
        this.fighterPlaceOne = fighterPlaceOne;
    }
    public void setFighterPlaceTwo(Match e){
        this.fighterPlaceTwo = fighterPlaceTwo;
    }
    public Fighter getFighterOne(){
        return fighterPlaceOne;
    }
    public Fighter getFighterTwo(){
        return fighterPlaceTwo;
    }
    public void setFighters(){
        this.fighterPlaceOne = fighterPlaceOne;
        this.fighterPlaceTwo = fighterPlaceTwo;
    }
    public Fighter[] getFighters(Match e){
        return new Fighter[] {fighterPlaceOne, fighterPlaceTwo};
    }
    public String toString(){
        return fighterPlaceOne.name() + " VS " + fighterPlaceTwo.name();
    }





}
