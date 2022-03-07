package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram_INTERVIEW {
    public static void main(String[] args) {


        String str1 = "acdb";//
        String str2 = "dbca";

        char[] ch1 = str1.toCharArray();// converting string to char
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));// single dimension array
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);// if they are asserting order
        Arrays.sort(ch2);

        System.out.println();

        boolean isAnagram = Arrays.equals(ch1,ch2);//comparing two arrays
        System.out.println("isAnagram = " + isAnagram);


        // write a program that can check if str1 & str2 are build out same characters
    }
}
