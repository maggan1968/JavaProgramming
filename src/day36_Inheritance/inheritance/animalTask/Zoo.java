package day36_Inheritance.inheritance.animalTask;

public class Zoo{
    public static void main(String[] args) {




    Dog dog = new Dog();
        dog.setInfo("Max","Husky", 'M', "large", 2, "black");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
       // dog.hunt();
        //dog. scratch();

     Cat cat = new Cat();
     cat.setInfo("Mrusia", "British",'F', "medium",4,"gray");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
       // cat.bark();
        // dog.hunt();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("Boo", "Sibirian", 'M',"large",7,"gold");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
       // tiger.bark();
        tiger.hunt();
        //dog. scratch();
        tiger.roar();
    }
    }

