package day39_Recap_OOP_Encapsulation_Inheritance.CydeoTask;

public class Employee extends Person{


    public double employeeId;
    public String jobTitle;
    public  double salary;

    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

}
/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary
Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */