package day37_inheritance.animalTask;

public class Fish extends Animal{

    public Fish(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }
    public void swim(){
        System.out.println(name + " is swimming");
    }
}
