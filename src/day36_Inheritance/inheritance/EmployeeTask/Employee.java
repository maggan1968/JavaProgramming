package day36_Inheritance.inheritance.EmployeeTask;

import day37_inheritance.ScrumTeamTask.Person;

public class Employee  {

    public String name;
    public char gender;
    public int age;
    public  String jobTitle;
    public  int id;
    public double salary;
    public String companyName;

    public Employee(String name, char gender, int age, String jobTitle, int id, double salary, String companyName) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }




    public void work(){
        System.out.println(jobTitle +" "+name+" is working");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +  // this gets the class name automatically
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
 Employee:
        name, gender, age, jobTitle, id, salary, companyName
        setInfo(), work(), toString()
    Tester
    Developer
    Driver
    Teacher
 */

