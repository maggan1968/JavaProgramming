package day13_StringClass;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        String str = "Im study the Java language";

        int totalChars = str.length();
        System.out.println("totalChars = " + totalChars);

       char firstChar = sentence.charAt(0);
       char lastChar = sentence.charAt(sentence.length()-1);

        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);

        scan.close();
    }
}
/*
write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

 */