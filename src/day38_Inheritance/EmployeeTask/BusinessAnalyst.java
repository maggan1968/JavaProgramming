package day38_Inheritance.EmployeeTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int id, String jobTitle, String salaryName, String companyName) {
        super(name, age, gender, id, jobTitle, salaryName, companyName);
    }

    @Override
    public void work() {
        System.out.println(name+ " is working");
    }
}
