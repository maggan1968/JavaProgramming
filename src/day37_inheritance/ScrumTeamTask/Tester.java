package day37_inheritance.ScrumTeamTask;

import day36_Inheritance.inheritance.EmployeeTask.Employee;

public class Tester extends Employee {

    //constructor
    public Tester(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "Tester", id, salary, companyName);//parent class constructor
    }

    public void test(){
        System.out.println(name+ " is testing");
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + "is creating ticket");
    }
}
/*
Create a sub class of Employee named Tester:
			Add any extra variable or method that Tester object need to have
 */

