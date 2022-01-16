package day39_Recap_OOP_Encapsulation_Inheritance.AnimalTask;

public class Parrot extends FriendlyAnimal {

    public Parrot(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);

    }
    public void fly(){
        System.out.println(getName()+ " its flying");
    }
    public void sing(){
        System.out.println(getName()+ " its singing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating");
    }
}
/*
4. Parrot:
					Extra methods:
						fly()
						sing()

 */