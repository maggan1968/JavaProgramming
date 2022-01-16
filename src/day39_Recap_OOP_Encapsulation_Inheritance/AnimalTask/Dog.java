package day39_Recap_OOP_Encapsulation_Inheritance.AnimalTask;

public class Dog extends FriendlyAnimal {


    public Dog(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }



    public void bark() {
        System.out.println(name + " " + breed + "is barking");
    }

    @Override
    public void eat() {
        System.out.println(name + " " + breed + "is eating dod food");
    }
}

/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()
 */