package day35_Encapsolation.encapsulation.EmployeeTask;

public class Person {

    // getter and setter has to be public
    private String name;
    private int age;

    //getter
    public String getName(){
        return name;

    }

    //  setter

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <=0 || age > 150){
            System.err.println("Invalid Age"+age);
            System.exit(0);
        }
        this.age = age;


    }
}
