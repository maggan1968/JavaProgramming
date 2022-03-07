package day39_Recap_OOP_Encapsulation_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Fredzia","Yorky",'F',5,"Small","Brown",false, true,true);
        System.out.println(dog);

        Cat cat = new Cat("Mrusia","Europien",'F',3,"Small","Grey",false, true,true);
        System.out.println(cat);

        Bear bear = new Bear("Bob","Grizly", 'M',6,"Large","Brown",true,false, false );
        System.out.println(bear);

        Crocodile crocodile = new Crocodile("Filipe","African",'M',8,"large", "Greenish-yellow", true,false, false);
        System.out.println(crocodile);

        Delfin delfin = new Delfin("Mia","Arabian", 'F',5,"Large","Grey",true,true, true );
        System.out.println(delfin);

        Eagle eagle = new Eagle("John","Golden", 'M',6,"Large","Brown",true,false, false );
        System.out.println(eagle);

        Lion lion = new Lion("Simba","White", 'F',7,"Large","White",true,false, false );
        System.out.println(bear);

        Parrot parrot = new Parrot("Kukulka","Cacatoo", 'F',3,"Large","White",true,true, true );
        System.out.println(parrot);

        Python python= new Python("Bom","Ball", 'M',6,"Large","Brown",true,false, false );
        System.out.println(python);

        Tiger tiger = new Tiger("Maxim","Siberian", 'M',8,"Large","Brown",true,false, false );
        System.out.println(tiger);

        dog.bark();
        dog.pet();
        dog.play();
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();

        cat.eat();
        cat.meow();
        cat.scratch();
        cat.sleep();
        cat.pet();
        cat.drink();
        cat.move();

        lion.move();
        lion.drink();
        lion.eat();
        lion.hunt();
        lion.sleep();


        tiger.sleep();
        tiger.eat();
        tiger.move();
        tiger.drink();
        tiger.sleep();


        parrot.sing();
        parrot.play();
        parrot.drink();
        parrot.eat();
        parrot.fly();




    }
}
/*
6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes

 */