package day21_ForEachLoop;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] newSentence= sentence.split(" ");

        for(int i=0; i< newSentence.length; i++){
            System.out.println(newSentence[i]);
        }

    }
}
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:

sentence -> "Java is fun"

Print

Java
is
fun
 */