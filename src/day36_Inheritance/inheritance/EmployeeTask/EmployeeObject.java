package day36_Inheritance.inheritance.EmployeeTask;

public class EmployeeObject {
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("SInem",'F',32,1234,"SDET",85000);
        tester.companyName="First American";
        tester.salary=90000;
        System.out.println(tester);

        Teacher teacher=new Teacher();
        teacher.setInfo("Alek", 'M',34,29,"Math Teacher",56000);
        teacher.gender='M';
        teacher.name="Faruk";
        teacher.salary=56000;
        System.out.println(teacher);
    }
}
