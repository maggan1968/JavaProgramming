package day43_Abstraction_Intro.employeeTask;

public abstract class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    public void work(){
        System.out.println(getName()+ "is developing");
    }
}
