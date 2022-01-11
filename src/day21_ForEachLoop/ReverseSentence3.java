package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence3 {
    public static void main(String[] args) {


        String sentence = "Today is a good day to learn Java";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
/*
        String[] reverseSentence = new String[words.length];

        int j=0;
        for (int i = words.length-1; i >=0 ; i--) {
            reverseSentence[j++]=words[i];//i: each of a words, then you have to concatenation
        }
        String result=reverseSentence[0];
        for (int i = 1; i < reverseSentence.length; i++) {
            result+=" "+reverseSentence[i];
        }

        System.out.println(result);

 */
        String reverseSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i] + " ";
        }
        System.out.println(reverseSentence);
    }
}
/*
1. Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
 */