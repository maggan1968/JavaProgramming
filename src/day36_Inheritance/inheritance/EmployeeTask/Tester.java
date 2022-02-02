package day36_Inheritance.inheritance.EmployeeTask;

public class Tester extends Employee{

    public void test() {
        System.out.println(jobTitle + " " + name + " is testing");
    }

    public void createTicket() {
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }
}
/*
2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary
			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()
 */