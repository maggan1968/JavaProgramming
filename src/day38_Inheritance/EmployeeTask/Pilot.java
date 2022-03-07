package day38_Inheritance.EmployeeTask;

public class Pilot extends Employee{

    public Pilot(String name, int age, char gender, int id, String jobTitle, String salaryName, String companyName) {
        super(name, age, gender, id, jobTitle, salaryName, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+ "is working");
    }
}
