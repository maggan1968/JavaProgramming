package replits.string;

import java.util.Scanner;

public class PrintTheLongestWord {
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
Write a program that will print out the longest word.
 Note: Assume the length of the two given Strings will be different

input:
bill
check

output: check
 */