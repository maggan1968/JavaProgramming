package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {


// creating char of the method // toCharArray()
        String str = "Java";
        char[] chars = str.toCharArray();// [J,a,v,a]
        System.out.println(Arrays.toString(chars));

        for (char each : str.toCharArray()) {
            System.out.println(each);
        }
        System.out.println("----------------------------------");

        //split();

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("=============================================");

        String s = "Today is nice day. Today is Monday. Today we learn Java";
        String[] sentences = s.split("\\."); // if you splitting by a dot, you need use e special character \\

        System.out.println(Arrays.toString(sentences));
    }
}
