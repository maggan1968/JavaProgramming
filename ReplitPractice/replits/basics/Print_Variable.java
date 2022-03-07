package replits.basics;

import java.util.Scanner;

public class Print_Variable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int first = scan.nextInt(); // do not change
       // int second = scan.nextInt();

        int first= 55;
        int second= 123;

        System.out.println("first is "+ first+ " and second is "+ second);

    }
}
/*
Given two variables first and second with values,
write a statement that will print the values in a single line.

Ex:

Input: 55 123

Output: first is 55 and second is 123

Input: -124 -500

Output: first is -124 and second is -500
 */