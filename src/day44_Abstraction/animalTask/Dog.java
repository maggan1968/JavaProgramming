package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable{


//step3
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);//super key calls constructor from Parent class
    }
//step1
    public void bark(){
        System.out.println(getName()+" is barking");



    }

    //step2
    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");


        //because we want implement interface Playable,we need to override this
    }
        public void play() {
            System.out.println(getName() + " is playable");



        }
    }



