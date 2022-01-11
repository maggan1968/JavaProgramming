package day36_Inheritance.inheritance.EmployeeTask;

public class EmployeeObject {
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("SInem",'F',32,"SDET",1234,85000,"State Farm");
        tester.companyName="First American";
        tester.salary=90000;
        System.out.println(tester);

        Teacher teacher=new Teacher();
        teacher.setInfo("Alek", 'M',34,"Math Teacher",29,56000,"CYDEO");
        teacher.gender='M';
        teacher.name="Faruk";
        teacher.salary=56000;
        System.out.println(teacher);
    }
}
