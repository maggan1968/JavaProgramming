package replits.if_Statements;

import java.util.Scanner;

public class If_Statements_Grades {
    public static void main(String[] args) {


            Scanner s = new Scanner(System.in);

            int grade = 55;
            //int grade = s.nextInt();
            //Write your code here:

            if(grade >= 90){
                System.out.println("excellent");


            }else if(grade >= 70 && grade< 90){
                System.out.println("good");


            }else if(grade >= 60 && grade < 70){
                System.out.println("pass");


            }else if(grade < 60){
                System.out.println("fail");


            }
        }
}
/*
Write a program that takes the grade int and prints if it's a passing grade or failure.

if grade is bigger than 90 output "excellent"
if the grade is bigger than 70 and smaller then 90 output "good"
if grade is bigger than 60 and smaller than 70 output "pass"
if grade is smaller than 60 output "fail"
Examples:

93

excellent
93

excellent
46

fail
46

fail
80

good
 */