package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

// toString();
        int[]nums = {1,2,3,4,5};
        System.out.println( nums);//hashcode
        System.out.println(Arrays.toString(nums));//"{1,2,3,4,5}"

       /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());

        */

        System.out.println("=========================================");

      // sort();
        int[] scores = {95,100,66,87,45,67};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);//{45,66...100}
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("minimum score = " + scores[0]);
        System.out.println("maximum score = " + scores [scores.length-1]);


        String[]names = {"Gunnay", "Anna", "Ahmet", "Maria", "Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[]words = {"Gunnay", "ANNA", "Ahmet", "MARIA", "Sinem"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        System.out.println("========================================");

        // equals();
        int[]arr1 ={1,2,3};
        int[]arr2 ={1,3,2};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);//{1,2,3}
        Arrays.sort(arr2);//{1,3,2}

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);


        System.out.println("=========================================");
       // anagram task can man solve like that
        //"acb", "bac"
        char[] ch1 ={'a','c','b'};
        char[] ch2 ={'b','a','c'};

        Arrays.sort(ch1); //{a, b, c}
        Arrays.sort(ch2); //{a, b, c}

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);



    }
}
