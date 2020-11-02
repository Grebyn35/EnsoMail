public class Dog extends AbstractAnimal{


    private int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public void Noise() {
        System.out.println("The dog says Woof");
    }

    @Override
    public void age() {
        System.out.println("the dog is "+age+" years old");
    }

    @Override
    public void FoodPreference() {
        System.out.println("The dog prefers meat");
    }

    @Override
    public void Gender() {
        System.out.println("Male");
    }
}
