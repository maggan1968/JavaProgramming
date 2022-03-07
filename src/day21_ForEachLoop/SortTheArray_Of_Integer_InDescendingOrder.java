package day21_ForEachLoop;

import java.util.Arrays;

public class SortTheArray_Of_Integer_InDescendingOrder {
    public static void main(String[] args) {

        int[] numbers = {10, 9,0,1,2,30,4,6,7,8};
       int[]descending = new int[numbers.length];
        Arrays.sort(numbers);//sorts the array in descending order
        for (int i = numbers.length-1,j=0; i >=0 ; i--,j++) {
            descending[j]=numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(descending));
    }

}
/*
 Write a program that sort the array of integer in descending order
 */