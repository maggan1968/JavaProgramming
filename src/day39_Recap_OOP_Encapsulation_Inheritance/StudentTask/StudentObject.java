package day39_Recap_OOP_Encapsulation_Inheritance.StudentTask;

public class StudentObject {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("Alex", 37, 'M', 12345, "Java", 'A', "Cydeo");
        graduateStudent.study();
        graduateStudent.getName();
        System.out.println(graduateStudent);
        System.out.println("-------------------------------------------------");

        Student student = new Student("Lee", 32, 'M', 12346, "Java", 'C', "Cydeo");
        student.study();
        student.getStudentId();
        System.out.println(student);
        System.out.println("-------------------------------------------------");

        UnderGraduateStudent undergraduateStudent = new UnderGraduateStudent("Jack", 28, 'F', 12347, "Python", 'F', "Cydeo");
        undergraduateStudent.study();
        undergraduateStudent.getGrade();
        System.out.println(undergraduateStudent);
        System.out.println("-------------------------------------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("Tony", 29, 'F', 6666, "Programming", 'B', 25, 31, "Ruby");
        cydeoStudent.study();
        cydeoStudent.getGroupNumber();
        System.out.println(cydeoStudent);

    }
}
/*
4. Create a class named StudentObjects:

						Create the objects of each sub classes

						test all the functions of each objects

            			Analyze the relationships between the classes

 */