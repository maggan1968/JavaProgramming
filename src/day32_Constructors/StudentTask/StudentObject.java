package day32_Constructors.StudentTask;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

      Student student1 = new Student("Ahmet");

      Student student2 = new Student ("Margie", 'F');

      Student student3 = new Student ("Olek", 11);

      Student student4 = new Student ("Aziza", 12,'B');

      Student student5 = new Student ("Albert", 'M',53);

      Student student6 = new Student ("Anna", 'F', 46, 16);

      Student student7 = new Student ("Becia", 'F',35,4,'D');


        System.out.println(student1 == student2);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};
        System.out.println(Arrays.toString(students));
    }
}
