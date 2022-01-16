package day39_Recap_OOP_Encapsulation_Inheritance.AnimalTask;

public class Cat  extends FriendlyAnimal {


    public Cat(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void scratch() {
        System.out.println(getName() + " is scratching");
    }

    public void meow() {
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");


    }
}

/*
2. Create the following subclasses of FriendlyAnimal and Override the eat method
Cat:
					Extra methods:
						scratch()
						meow()

 */