package day12_Scanner;



import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();//Wooden SpoonEnter



        System.out.println("Enter your Programing Language:");
        String programming = input.nextLine();// Java Programing Language

        System.out.println("Enter your age");
        int age = input.nextInt();//24

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
    }
}
