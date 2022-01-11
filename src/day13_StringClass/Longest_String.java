package day13_StringClass;

import java.util.Scanner;

public class Longest_String {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first strings");
        String s1 = scan.nextLine();

        System.out.println("Enter second string");
        String s2 = scan.nextLine();
        scan.close();

        int l1 = s1.length();
        int l2 = s2.length();

        System.out.println("Longest string is:");
        if (l1 > l2){
            System.out.println(s1);
        } else {
            System.out.println(s2);
        }
    }
}
/*
write a program that asks user to enter two strings, and print out the longest string
 */