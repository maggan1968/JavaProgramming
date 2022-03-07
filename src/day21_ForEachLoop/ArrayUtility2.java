package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

        //copyOf();  always  start of beginning first elements of array

        String[]students = {"Magda","Iga","Aga","Margie","Pati"};
        String[]earlyBirds = Arrays.copyOf(students,3);//copy 3 element of array

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers= {1,2,3,4,5,6,7,8,9};
        numbers = Arrays.copyOf(numbers,5);//{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));

        System.out.println("=====================================================");

        char[]ch1 ={'A','B','C','D','E','F','G','H','I'};
        char[]ch2 = Arrays.copyOfRange(ch1, 2,6);// ending index is excluded

        System.out.println(Arrays.toString(ch2));


        //print the elements of array between 40 and 80
        int[]scores = {10,20,30,40,50,60,70,80,90,100};
        //index         0  1  2  3  4  5  6  7  8  9
        int[]result = Arrays.copyOfRange(scores,3,8);

        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(Arrays.toString(result2));
    }
}
