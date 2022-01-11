package day1_12_04_2021;

public class CharOfTheOriginalString {
    public static void main(String[] args) {

        String word= "CYDEO";
        int lastIndexOfChar = word.length()-1;
        int lastsecondOfChar = word.length()-2;
       String result = ""+ word.charAt(lastsecondOfChar)+word.charAt(lastIndexOfChar);

        

        System.out.println(result);

    }
}
/*
2. Create a method print a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.

 */