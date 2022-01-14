package day38_Inheritance.EmployeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, String salaryName, String companyName) {
        super(name, age, gender, id, jobTitle, salaryName, companyName);
    }

    public void code(){
        System.out.println(jobTitle + " " +name+ " is coding");
    }
    public void fixingBugs() {
        System.out.println(jobTitle + " " + name + " is fixing bugs");
    }

    @Override
    public void work() {
        System.out.println(name+ "is working");
    }
}
