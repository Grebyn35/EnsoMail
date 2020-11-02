public abstract class AbstractAnimal {

    public abstract void Noise();
    public abstract void age();
    public abstract void FoodPreference();
    public abstract void Gender();

    public final void info(){
    Noise();
    age();
    FoodPreference();
    Gender();

    }

}
