package day35_Encapsolation.encapsulation.EmployeeTask;

public class Employee {

    private  String name;
    private  char gender;
    private int age;
    private  double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        if(name.isEmpty()){
            return;
        }

        this.name = name;
    }


    public void setGender(char gender) {
        if(  !(gender == 'M' || gender == 'F')  ){
            return;
        }

        this.gender = gender;
    }


    public void setAge(int age) {
        if(age < 16 || age > 90){
            return;
        }

        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary <=0){
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static class EmployeeObject {
        public static void main(String[] args) {

            Employee employee1 = new Employee("Tatiana",'F',26,120000);

            employee1.setAge(32);


            Employee employee2 = new Employee("Margie",'F', 31,135000);
            employee2.setSalary(employee2.getSalary()+ 15000);
            employee2.setName("Elvira");

            System.out.println(employee1);
            System.out.println(employee2);
        }
    }
}
/*
Create an Employee Class:
            private variables:
                name, gender, age, salary

            Encapsulate all the private fields

                1. Name can not be empty
                2. gender can not anything other than female or male
                3. age can not be less than 16 , and greater than 98
                4. salary can not be zero or negative
 */