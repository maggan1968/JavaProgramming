package day20_Arrays;

import java.util.Arrays;
import java.util.SortedMap;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[]letters = new char[26];//A,B,C,D......

        for (char i = 'A',j = 0; i <= 'Z' && j < letters.length; i++, j++) {//two variables in the same time
            letters[j]=i;
        }


        System.out.println(Arrays.toString(letters));//[A~Z]

        System.out.println("----------------------------------------------------");

    }
}
