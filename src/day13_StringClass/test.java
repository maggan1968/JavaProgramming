package day13_StringClass;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();  // elcnU
        //index:       01234

        String result = ""; // knalB

        if(word.length() > 5){
            result = "Too Long";
        }else if(word.length() < 5){
            result = "Too Short";
        }else{ // if length of the string is 5


            result =  ""+ word.charAt(4) + word.charAt(3) +word.charAt(2) + word.charAt(1) + word.charAt(0);
            //               e                 l              c                  n                U

        }

        System.out.println(result);

    }
}
/*
Create a class called Reverse, write a program that will reverse a string.
 Your program should reverse a string only 5 characters long.
  If word is shorter, display message: "Too short!".
   If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.
 */
