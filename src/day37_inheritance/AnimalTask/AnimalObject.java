package day37_inheritance.AnimalTask;

public class AnimalObject {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Max","Husky", 'M', "large", 2, "black");
        System.out.println(dog1);

        Cat cat1 = new Cat("Mrusia", "British",'F', "medium",4,"gray");
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("Pipi", "Moscow",'M', "small", 5, "yellow");
        System.out.println(parrot1);

        Fish fish1 = new Fish("Coco", "Gold Fish",'F', "medium",4,"gold");
        System.out.println(fish1);
    }
}
