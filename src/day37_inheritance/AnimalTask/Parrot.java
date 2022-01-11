package day37_inheritance.AnimalTask;

public class Parrot extends Animal{

    public Parrot(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
       // this.parrotWingColor= parrotWingColor;
    }
    public void talk(){
        System.out.println(name+ " is talking");
    }
}
