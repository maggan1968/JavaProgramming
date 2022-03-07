package day39_Recap_OOP_Encapsulation_Inheritance.AnimalTask;

public class Delfin extends FriendlyAnimal {

    public Delfin(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);

    }
    public void swim(){
        System.out.println(getName() + " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }
}
/*
 Create the following sub classes of FriendlyAnimal and Override the eat method


			3. Dolphin:
					Extra methods:
						swim()
 */