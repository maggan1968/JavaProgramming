package day44_Abstraction.animalTask;

//step1
public final class Cat extends Animal implements Playable {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    //step2
    @Override
    public void eat() {
        System.out.println(getName() + " eating ris");

    }

    public void meow() {
        System.out.println(getName() + " is meowing");
    }


    //because we want implement interface Playable,we need to override this

    public void play() {
        System.out.println(getName() + " is playable");
    }
}

