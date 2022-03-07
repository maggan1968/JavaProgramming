package day25_CustomMethod_Overloading;

public class MaxNumber_Overloading {

    //create a method that can return the max number from an integer array
    public static int maxNumberOfArray (int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    //create a method that can return the max number from double array
    public static double maxNumberOfArray (double[] arr){
        double max = arr[0];
        for (double i : arr) {
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    //create a method that can return the max number from long array
    public static long maxNumberOfArray (long[] arr){
        long max = arr[0];
        for (long i : arr) {
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    //create a method that can return the max number from short array
    public static short maxNumberOfArray (short[] arr){
        short max = arr[0];
        for (short i : arr) {
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    //create a method that can return the max number from float array
    public static float maxNumberOfArray (float[] arr){
        float max = arr[0];
        for (float i : arr) {
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    //create a method that can return the max number from byte array
    public static byte maxNumberOfArray (byte[] arr){
        byte max = arr[0];
        for (byte i : arr) {
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arrInt = {1,2,3,5,10,6};
        System.out.println(maxNumberOfArray(arrInt));
        System.out.println("-----------------");

        double[] doubleArr = {2.5,3.6,3.7,1.1};
        System.out.println(maxNumberOfArray(doubleArr));
        System.out.println("-----------------");

        long[] longArr = {1,2,3,99999999999L,10,6};
        System.out.println(maxNumberOfArray(longArr));
        System.out.println("-----------------");

        short[] shortArr = {10,20,50,30,25};
        System.out.println(maxNumberOfArray(shortArr));
        System.out.println("-----------------");

        float[] floatArr = {2.5F,3.6F,3.7F,1.1F};
        System.out.println(maxNumberOfArray(floatArr));
        System.out.println("-----------------");

        byte[] byteArr = {100, 30, 125, 55};
        System.out.println(maxNumberOfArray(byteArr));
    }
}


