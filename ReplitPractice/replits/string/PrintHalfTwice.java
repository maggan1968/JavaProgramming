package replits.string;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int middle=(word.length())/2;
        String halfWord = word.substring(0,middle);
        System.out.println(halfWord + halfWord);

    }
}
/*
Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja
input: java

output: jaja
input: unity

output: unun
 */