public class Gnu extends AbstractAnimal{

    private int age;

    public Gnu(int age) {
        this.age = age;
    }


    @Override
    public void Noise() {
        System.out.println("The gnu says Moo");
    }

    @Override
    public void age() {
        System.out.println("The gnu is "+age+" years old");
    }


    @Override
    public void FoodPreference() {
        System.out.println("The gnu prefers Grass");
    }

    @Override
    public void Gender() {
        System.out.println("Male");
    }
}
