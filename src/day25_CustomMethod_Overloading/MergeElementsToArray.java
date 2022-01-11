package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeElementsToArray {
    public static void main(String[] args) {

        int[] arrInt1 = {1,2,3};
        int[] arrInt2 = {4,5};
        System.out.println(Arrays.toString(merge(arrInt1,arrInt2)));
        System.out.println("--------------------------------");

        double[] arrDouble1 = {2.5,3.5,6.5};
        double[] arrDouble2 = {1.5,10.8};
        System.out.println(Arrays.toString(merge(arrDouble1,arrDouble2)));
        System.out.println("--------------------------------");

        char[] arrChar1 = {'A', 'B', 'C'};
        char[] arrChar2 = {'D', 'E', 'F'};
        System.out.println(Arrays.toString(merge(arrChar1,arrChar2)));
        System.out.println("--------------------------------");

        String[] arrString1 = {"Cat", "Dog", "Turtle"};
        String[] arrString2 = {"Tiger", "Lion"};
        System.out.println(Arrays.toString(merge(arrString1,arrString2)));
    }

    // merge two arrays of int
    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (int each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (int each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of double
    public static double[] merge(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (double each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (double each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of String
    public static String[] merge(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (String each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (String each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of char
    public static char[] merge(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (char each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (char each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }
}
