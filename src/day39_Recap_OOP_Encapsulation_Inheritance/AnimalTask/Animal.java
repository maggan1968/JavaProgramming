package day39_Recap_OOP_Encapsulation_Inheritance.AnimalTask;

public class Animal {

    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Name can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null) {
            System.err.println("Breed can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender =='M' || gender == 'F')
            System.out.println(getGender());
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <=0 || age > 150){
            System.err.println("Invalid Age"+age);
            System.exit(0);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            System.err.println("Color can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" "+breed+ " is eating");
    }

    public void drink() {
        System.out.println(name + " " + breed + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " " + breed + " is sleeping");

    }

    public void move() {
        System.out.println(name + " " + breed + " is moving");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()

 */