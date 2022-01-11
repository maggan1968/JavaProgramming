package day14_String;

import java.util.Scanner;

public class String_No_End_WithoutTheLastLetter {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        int lastLetter=txt.length()-1;
        System.out.println(txt.substring(0,lastLetter));



    }
}
/*
Given a String txt print the value without the last letter

Ex:

Input:
foo

Output:
fo
Input:
run

Output:
ru
Hint: Use substring() and length()
 */