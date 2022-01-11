package day2_Practice_String_IfStatements_ForLoop;

import java.util.Scanner;

public class FactorialNumber_INTERVIEW {
    public static void main(String[] args) {

        /* Write a program that can return the factorial number of any given number
         Ex:
                        input: 5
output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
multiplying them starting from the number they have given to you
                          */
//for loop

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
       int number = scan.nextByte();
        
        int result= 1;// numer 1 jest najmniejsza liczba w mnozeniu

        //if (number>2) {//
            for (int i = number; i >= 1; i--) {//i--: 5 => 4 => 3 => 2
                result *= i;//5*4=20*3=60*2=120
            }
            // }else {
           // result=number;


        System.out.println("result = " + result);

        
        
    }
}
