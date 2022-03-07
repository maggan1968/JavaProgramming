package Day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();// xcodex

        if (word.charAt(0)=='x'){
            word=word.replaceFirst("x", "a");//acodex
        }
        System.out.println(word);
        scan.close();
    }
}
  /*
    Write a program that asks user to enter a word.
    If the work starts with x, replace it with a.

        Input:
        xcodex
        Output:
        acodex
        */