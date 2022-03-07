package day36_Inheritance.inheritance.EmployeeTask;

public class Developer extends Employee{


    public Developer(String name, char gender, int age, String jobTitle, int id, double salary, String companyName) {
        super(name, gender, age, jobTitle, id, salary, companyName);
    }

    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding");
    }

    public void fixingBugs(){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }


}

/*
2.3 Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary
			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */
