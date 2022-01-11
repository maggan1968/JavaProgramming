package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
  public static void main(String[] args) {

    Dog dog1 = new Dog();

    dog1.name = "Lucy";
    dog1.breed = "Husky";
    dog1.age = 3;
    dog1.gender = 'F';
    dog1.size = "Large";
    dog1.color = "White";

    Dog dog2 = new Dog();

    dog2.name = "Lola";
    dog2.breed = "Yorke";
    dog2.age = 5;
    dog2.gender = 'F';
    dog2.size = "Small";
    dog2.color = "Silver";

    Dog dog3 = new Dog();
    dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog3);

    dog1.eat();

    dog2.bark();

    Dog dog4 = new Dog();
    dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

    Dog dog5 = new Dog();
    dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

    System.out.println("-----------------------------------");
// with Loop
    Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

    ArrayList<Dog> femaleDogs = new ArrayList<>();
    ArrayList<Dog> maleDogs = new ArrayList<>();

    for (Dog each : dogs) {
      if (each.gender == 'M') {
        maleDogs.add(each);
      } else {
        femaleDogs.add(each);
      }
    }
    System.out.println("maleDogs = " + maleDogs);
    System.out.println("femaleDogs = " + femaleDogs);

    System.out.println("-----------------------------------");

    //without Loop

    ArrayList<Dog> femaleDogs2 = new ArrayList<>(Arrays.asList(dogs));
    ArrayList<Dog> maleDogs2 = new ArrayList<>(Arrays.asList(dogs));

    femaleDogs.removeIf(p -> p.gender == 'M');
    maleDogs.removeIf(p -> p.gender == 'F');

    System.out.println("maleDogs = " + maleDogs);
    System.out.println("femaleDogs = " + femaleDogs);

  }
}

