package replits.string;

import java.util.Scanner;

public class PrintFirstCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char a = word.charAt(0);
        word=word.substring(word.length()-1);
        System.out.println(a + word);


    }
}
/*
Write a program that will print out the first character of the word.

Ex:

Input: jump
Input: jump
Output: j
 */