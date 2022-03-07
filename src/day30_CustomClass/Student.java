package day30_CustomClass;

public class Student {

    //instance variable
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    //"this " keyword helps to generate instances
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }


    public void eat() {
        System.out.println(name + "is eating");

    }

    public void sleep() {
        System.out.println(name + "is sleeeping");
    }

    public void drink() {
        System.out.println(name + "is drinking");
    }

    public void cod() {
        System.out.println(name + "is coding Java");
    }

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
}


/*
Student Class:

	Attributes:
		name, gender, age, studentID

	Actions:
		eat(), sleep(), drink(), code()
		setInfo(): to set all the attributes of student object
		toString(): to print the full info of student


 */