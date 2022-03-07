package utilities;

import java.util.Arrays;

public class ArraysUtility {


    // 1.prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }

    }


    //2.prints each double of double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }


    //3.prints each char of char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }


    //4.prints each String of String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //5.returns the maximum number from integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //6.returns the maximum number from double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //7.returns the minimum number from integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //8.returns the minimum number from double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //9.checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
    public static boolean contains(int[] array, int element) {

        boolean result = false;

        for (int each : array) {
            if (each == element) { // if any array's element is matching with the given element, it means the given elements is contained in the array
                result = true;
            }
        }

        return result;
    }


    //10.checks if the given double is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element) {

        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;
    }


    //11.checks if the given char is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;
    }


    //12.checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }

        return result;
    }



    //13. merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){


            int[] result = {};

            for (int each : arr1) {
                result = ArraysUtility.addElement(result, each);
            }

            for (int each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }
            return result;
        }


    // merge two arrays of double
    public static double[] merge(double[] arr1, double[] arr2) {

            double[] result = {};

            for (double each : arr1) {
                result = ArraysUtility.addElement(result, each);
            }
            for (double each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }
            return result;
        }


    // merge two arrays of String
    public static String[] merge(String[] arr1, String[] arr2) {

           String[] result = {};

            for (String each : arr1) {
                result = ArraysUtility.addElement(result, each);
            }
            for (String each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }
            return result;
        }


    // merge two arrays of char
    public static char[] merge(char[] arr1, char[] arr2) {

            char[] result = {};

            for (char each : arr1) {
                result = ArraysUtility.addElement(result, each);
            }
            for (char each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }
            return result;
        }



    //17. remove  the index from the array, return new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) { // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        int[] result = new int[array.length - 1];
    int j =0;
       for (int i = 0; i < array.length; i++) {
            if (i == index) { // moves all the elements of array except the element at given index
               continue;
            }
                result[j++] = array[i];
            }


        return result;
    }


    //18. remove  the index from the array, return new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) { // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        double[] result = new double[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) { // stores all the elements of array except the element at given index
                continue;
            }
                result[j++] = array[i];
            }


        return result;
    }


    //19. remove  the index from the array, return new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) { // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        String[] result = new String[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) { // stores all the elements of array except the element at given index
                continue;
            }
                result[j++] = array[i];
            }


        return result;
    }


    //20. remove  the index from the array, return new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) { // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        char[] result = new char[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) { // stores all the elements of array except the element at given index
                continue;
            }
                result[j++] = array[i];
            }


        return result;
    }


    //21.reverses the given integer array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }

    //22.reverses the given double array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //23.reverses the given String array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //24.reverses the given char array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


    //25. returns the unique elements from the array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};

        for (int each : array) { // getting each element
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // unique element
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //26. returns the unique elements from the array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};

        for (double each : array) { // getting each element
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // unique element
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //27. returns the unique elements from the array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};

        for (String each : array) { // getting each element
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // unique element
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //28. returns the unique elements from the array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};

        for (char each : array) { // getting each element
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // unique element
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //29. returns the frequency of the given element for the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    //30. returns the frequency of the given element for the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;

        for (double each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    //31. returns the frequency of the given element for the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;

        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }

        return count;
    }

    //32. returns the frequency of the given element for the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;

        for (char each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }


    //33.removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //34.removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //35.removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }



    //36.removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }


    //37. adds the element to array, return a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //38. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //39. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //40. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //41. replace the element of the array at given index with the new element
    public static int[] replaceElement(int[] array,int index, int newElement){


        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        //first we call index , then we assign a new element.
        array[index]= newElement;
        return array;
    }


    //42. replace the element of the array at given index with the new element
    public static double[] replaceElement(double[] array, int index, double newElement){


        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        //first we call index , then we assign a new element.
        array[index]= newElement;
        return array;
    }


    //42. replace the element of the array at given index with the new element
    public static char[] replaceElement(char[] array,int index, char newElement){


        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        //first we call index , then we assign a new element.
        array[index]= newElement;
        return array;
    }


    //43 replace the element of the array at given index with the new element
    public static String[] replaceElement(String[] array,int index, String newElement){


        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        //first we call index , then we assign a new element.
        array[index]= newElement;
        return array;
    }


    //44. replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[]array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }


    //45. replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[]array,double oldValue,double newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }


    //46. replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[]array,char oldValue,char newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }


    //47. replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[]array,String oldValue,String newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }

        }
        return array;
    }
}



