package day39_Recap_OOP_Encapsulation_Inheritance.AnimalTask;

public class Eagle extends WildAnimal {


    public Eagle(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }



    @Override
    public void hunt() {
        System.out.println(getName()+ "is hunting");
    }
}

/*
5. Create the following subclasses of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile

 */