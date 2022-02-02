package day42_Exceptions_ThrowsKeyword.inheritance.EmployeeTask;

public class Tester extends Employee {

    public void test() {
        System.out.println(jobTitle + " " + name + " is testing");
    }

    public void createTicket() {
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }
}
