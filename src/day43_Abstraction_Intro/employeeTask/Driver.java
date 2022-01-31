package day43_Abstraction_Intro.employeeTask;

public  class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName()+" is driving ");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 10 hours");

    }
}
