package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodPractice4_RemoveDuplicates;
import day24_CustomMethods_Return.ReturnMethod_Intro;
import utilities.StringUtility;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] a = new int[size];
        int i = 0;
        while (i < size) {
            a[i++] = input.nextInt();
        }
        method8(a);
    }
    public static void method8(int[] arr) {
        for(int n : arr){
            if(n %4 ==0){
                continue;
            }
            System.out.println(n);

    }

        String str= "aaaaaaaaaaaaaabbbbbbbbbbb";

       str= ReturnMethodPractice4_RemoveDuplicates.removeDuplicates(str);

        System.out.println(str);

        String name ="Java Programming";

       String reversedName = ReturnMethod_Intro.reverse(name);
        System.out.println(reversedName);


        System.out.println("---------------------------------------");

        String str1 = "Wooden Spoon";
        StringUtility.printEachChar(str1);

        System.out.println("---------------------------------------");

        int[]items= {2,7,3,5,8,9};
        int funny = items[0];
        for (int i = 0; i < items.length; i++) {
         if (items[i]>funny)
             funny = items[i];
        }
        System.out.println(funny);


        System.out.println("---------------------------------------");




    }
}
