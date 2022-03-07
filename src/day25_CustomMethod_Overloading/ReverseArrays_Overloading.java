package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class ReverseArrays_Overloading {

    public static void main(String[] args) {

        int a[] = {10, 4, 58, 63, 24, 74, 2};
        System.out.println(Arrays.toString(reverseArray(a)));

        double h[] = {10.5, 4, 58.6, 63, 24.4, 74, 2.2};
        System.out.println(Arrays.toString(reverseArray(h)));

        long b[] = {108, 4000, 5832, 63, 24, 7400, 200000};
        System.out.println(Arrays.toString(reverseArray(b)));

        float j[] = {1.5F, 4, (float) 58.6, 63, (float) 24.4, 74, (float) 2.2};
        System.out.println(Arrays.toString(reverseArray(j)));
    }

//1. Create a method that can reverse an integer array
    public static int[] reverseArray(int[] a) {
        int reverseArray[] = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {

            reverseArray[j] = a[i];
            j++;
        }
        return reverseArray;
    }

//2. Create a method that can reverse a double array
    public static double[] reverseArray(double[] a) {
        double reverseArray[] = new double[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {

            reverseArray[j] = a[i];
            j++;
        }
        return reverseArray;
    }

//3. Create a method that can reverse a long array
    public static long[] reverseArray(long[] a) {
        long reverseArray[] = new long[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {

            reverseArray[j] = a[i];
            j++;
        }
        return reverseArray;
    }

//4. Create a method that can reverse a float array
    public static float[] reverseArray(float[] a) {
        float reverseArray[] = new float[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {

            reverseArray[j] = a[i];
            j++;
        }
        return reverseArray;
    }
}
