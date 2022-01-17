package day39_Recap_OOP_Encapsulation_Inheritance.StudentTask;

public class UnderGraduateStudent  extends Student {


    public UnderGraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
    }

}
/*
2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

 */