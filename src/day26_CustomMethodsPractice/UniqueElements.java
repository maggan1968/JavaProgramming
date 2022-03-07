package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {




            int[] array = {1,1,2,3,3,4,5,5,6,7,7,7,2,4,6};

            int[] unique = uniqueElements(array);

            System.out.println(Arrays.toString(unique));

        System.out.println("---------------------------------------------------------");

            double[] array2 = {1.6,1.7,2.9,3.6,3.6,4.7,5.6,5.7,6.7,7.7,7,7,2,4,6};

            double[] unique2 = uniqueElements(array2);

            System.out.println(Arrays.toString(unique2));



        }

//  returns the unique elements from the array as a new array
        public static int[] uniqueElements(int[] array){
            int[] result = {}; //new int[0]

            for (int each : array) {

                if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                    result = ArraysUtility.addElement(result, each);
                }

            }

            return result;
        }




    // returns the unique elements from the array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};

        for (double each : array) { // getting each element
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // unique element
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // returns the unique elements from the array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};

        for (String each : array) { // getting each element
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // unique element
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // returns the unique elements from the array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};

        for (char each : array) { // getting each element
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // unique element
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }
}
