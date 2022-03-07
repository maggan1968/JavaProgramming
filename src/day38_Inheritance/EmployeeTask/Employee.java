package day38_Inheritance.EmployeeTask;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public int id;
    public String jobTitle;
    public String salaryName;
    public String companyName;

    public Employee(String name, int age, char gender, int id, String jobTitle, String salaryName, String companyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salaryName = salaryName;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name+ " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryName='" + salaryName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
Employee Task:
	1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()
 */