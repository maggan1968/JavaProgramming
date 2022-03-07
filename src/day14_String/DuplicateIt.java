package day14_String;

import java.util.Scanner;

public class DuplicateIt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String word3 = word1.replace(word1, word2);
        String word4 = word2.replace(word2, word1);
        System.out.println(word1+word2+word3+word4);
    }
}
/*
You have 2 words

Print the first word, second word, second word, first word
Input:

one
two
Output:

onetwotwoone
 */