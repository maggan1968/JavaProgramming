package day36_Inheritance.inheritance.EmployeeTask;

public class Driver extends Employee {

    public Driver(String name, char gender, int age, String jobTitle, int id, double salary, String companyName) {
        super(name, gender, age, jobTitle, id, salary, companyName);
    }

    public void drive(){
        System.out.println(jobTitle+" "+name+ " is driving");
    }

}
