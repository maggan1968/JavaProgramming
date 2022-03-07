package Day2_StringWithLoops_Multibranch_If;

import java.util.Scanner;

public class TwoFirstCharsMoveToTheEnd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        //String word ="Hello";
        String temp=word.substring(2)+word.substring(0,2);

        System.out.println("temp = " + temp);

        System.out.println("=========================================");

        String temp2 ="";

        for (int i = 2; i < word.length() ; i++) {
            temp2 += word.charAt(i);

        }
        for (char i = 0; i <2 ; i++) {
            temp2 += word.charAt(i);
        }


        System.out.println("temp2 = " + temp2);

        }

        }



    /*
  Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
                The string length will be at least 2.

                input :"Hello" -> "lloHe"
                input :"java" → "vaja"
                input :"Hi" → "Hi"
Elif Tasdelen — Today at 9:23 AM
thank you
     */

