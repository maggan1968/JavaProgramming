package day20_Arrays;

import java.util.Arrays;

public class ReverseArrayOfIntegers_INTERVIEW {
    public static void main(String[] args) {

        int[]array = {10, 20, 30, 40, 50};
// index:             0    1   2   3   4
        // enough capacity to contain the elements of original array
        int[]reversedArray = new int[array.length];
/*
        reversedArray[0] =array[array.length-1];// array[4]
        reversedArray[1] = array[3];
        reversedArray[2] = array[2];
        reversedArray[3] = array[1];
        reversedArray[4] = array[0];

 */

        int j=0;// j is the index numbers of reversedArray starting from index 0

        for (int i = array.length-1; i >=0 ; i--) { // i: is the index numbers of array starting from last index
            //for (int i = array.length-1; j=0 i >=0 ; i--, j++) {

            reversedArray[j++]=array[i];// I get the elements of array starting last index and store it into reversed array starting from index zero

        }
        System.out.println( Arrays.toString(array) );

        System.out.println( Arrays.toString(reversedArray));

    }
}
/*
 Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */