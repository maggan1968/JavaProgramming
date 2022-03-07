package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',"White","large",7);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());
        System.out.println(dog.getColor());

        dog.drink();
    }
}
