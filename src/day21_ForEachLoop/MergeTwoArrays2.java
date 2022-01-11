package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        String[] group1 = {"Ali","Layan","Margie"};
        String[] group2 = {"Maria", "Wojtek", "Noel"};

        String[] students = new String[group1.length+group2.length];

        int i =0;
        for (String each : group1) {
            students[i++]=each;
        }

        for (String each : group2) {
            students[i++]= each;

        }
        System.out.println(Arrays.toString(students));
        }

    }

/*
 write a program that can merge two arrays of words
        Ex:
            group1 = {"Ali","Layan","Margie"}
            group2 = {"Maria", "Wojtek", "Noel"}

        output
            group3= {"Ali","Layan","Margie","Maria", "Wojtek", "Noel"}
 */