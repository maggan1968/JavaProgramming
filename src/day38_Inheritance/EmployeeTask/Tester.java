package day38_Inheritance.EmployeeTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int id, String jobTitle, String salaryName, String companyName) {
        super(name, age, gender, id, jobTitle, salaryName, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle + " " + name + " is working");
    }

    public void test() {
        System.out.println(jobTitle + " " + name + "is testing");
    }

    public void createTicket() {
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }
}
