package day36_Inheritance.inheritance.EmployeeTask;

import day36_Inheritance.inheritance.EmployeeTask.Employee;

public class Teacher extends Employee {


    public Teacher(String name, char gender, int age, String jobTitle, int id, double salary, String companyName) {
        super(name, gender, age, jobTitle, id, salary, companyName);
    }

    public void teaching(){
        System.out.println(jobTitle+" "+name+" is teaching");
    }


}
/*
2.4 Create the sub class of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary
			Methods:
				setInfo()
				work()
				teaching()
				toString()
 */
