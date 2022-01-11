package day31_CustomClass_Constructors.StudentTask;

import day31_CustomClass_Constructors.StudentTask.Student;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Margie",53,'F','B',13);

        Student student2 = new Student("Ola",33,'F','A',14);

        System.out.println(student1);
        System.out.println(student2);

    }
}
