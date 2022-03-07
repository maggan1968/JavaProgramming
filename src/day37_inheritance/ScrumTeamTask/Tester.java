package day37_inheritance.ScrumTeamTask;

import day36_Inheritance.inheritance.EmployeeTask.Employee;

public class Tester extends Employee {
    public Tester(String name, char gender, int age, String jobTitle, int id, double salary, String companyName) {
        super(name, gender, age, jobTitle, id, salary, companyName);
    }

    //constructor
    //parent class constructor


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

