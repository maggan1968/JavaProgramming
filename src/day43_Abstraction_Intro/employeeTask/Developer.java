package day43_Abstraction_Intro.employeeTask;

public final class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    public void work(){
        System.out.println(getName()+ "is developing applications");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours");

    }
    public void initTest(){
        System.out.println(getName()+" is unit Testing");
    }
}
