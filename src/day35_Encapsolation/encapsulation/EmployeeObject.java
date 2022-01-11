package day35_Encapsolation.encapsulation;

public class EmployeeObject {
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
