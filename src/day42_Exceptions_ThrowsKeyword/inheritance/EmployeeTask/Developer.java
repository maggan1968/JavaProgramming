package day42_Exceptions_ThrowsKeyword.inheritance.EmployeeTask;

public class Developer extends Employee{

    public void code(){
        System.out.println(jobTitle+" "+name+ " is coding");
    }
    public void fixingBugs(){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }
}
