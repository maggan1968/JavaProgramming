package day2_Practice_String_IfStatements_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        /*
     Write a program that can check if the given String is palindrome

                 Ex:
                        input:
                               Level

                        output:
                               true
                         input:
                               Anna

                          output:
                                true

                       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.nextLine();

        String result = "";


        for (int i =  word.length()-1; i >= 0 ; i--) {
            result+=word.charAt(i);
        }
        boolean isPolindrome = word.equalsIgnoreCase(result);
        System.out.println(isPolindrome);
    }
}
