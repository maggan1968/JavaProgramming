package day44_Abstraction.animalTask;

public final class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" Is eating deer");
    }



//because we want implement interface Playable,we need to override this

public void hunt() {
    System.out.println(getName() + " hunt deer");

}
}