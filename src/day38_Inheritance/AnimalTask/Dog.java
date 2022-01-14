package day38_Inheritance.AnimalTask;

public class Dog extends Animal {


    public Dog(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+ "Eats dog food");

    }
}
/*
2. Create the followin sub classes of Animal and override the eat method:

			2. Dog
					eat(): eats dog food
 */