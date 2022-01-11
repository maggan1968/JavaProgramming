package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

       String firstName = "Jimmy";
       String lastName = "King";
       int age = 45;
       String  jobTitle = "SDET";
       String companyName = "Apple Inc";
       double salary = 100000.58;

       String fullName =  firstName + " " + lastName;

       // Full name of the person is________
        System.out.println("Full name of the person is " + fullName );

        // ____is ____ years old.

        System.out.println(fullName + " is " + age + " years old. ");

        //FullName is JobTitle, works at CompanyName, and FullName' salary is Salary

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName + "' salary is " + salary );
    }
}
