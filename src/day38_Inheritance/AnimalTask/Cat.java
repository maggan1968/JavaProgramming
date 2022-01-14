package day38_Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+ " eats cat food");
    }
}
/*
2. Create the followin sub classes of Animal and override the eat method:
			1. Cat
					eat(): eats cat food

 */