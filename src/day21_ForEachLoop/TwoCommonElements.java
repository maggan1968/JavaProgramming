package day21_ForEachLoop;

public class TwoCommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        int[] arr2 = {4, 5, 6, 7, 8};

        for (int element : arr2) { // gets the elements of arr2
            for (int each : arr1) { // each: 1,2,3,4,5 .   gets the elements of arr1
                if (each == element) {
                    System.out.println(each);
                }
            }
        }
    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

 */