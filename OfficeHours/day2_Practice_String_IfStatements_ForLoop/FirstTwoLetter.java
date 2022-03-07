package day2_Practice_String_IfStatements_ForLoop;

import java.util.Scanner;

public class FirstTwoLetter {
    public static void main(String[] args) {
    /* (substring-length-isEmpty)

 Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
  If the string is shorter than length 2, return whatever there is, so "X" yields "X",
  and the empty string "" yields the empty string "".

                              Input :"Hello"   → "He"
                              Input :"abcdefg" → "ab"
                              Input :"a"         → "a"
                              Input :""         → "It can not be empty"
         */
//create scanner
        Scanner input = new Scanner(System.in);
//create String any word
        System.out.println("Please enter a word:");
        String word = input.nextLine();

 //and the empty string "" yields the empty string "".
        if (word.isEmpty()){
            System.out.println("It can not be empty");
          //  If the string is shorter than length 2
        }else if (word.length()<=2) {
            System.out.println(word);
        }else {
            System.out.println(""+word.charAt(0)+word.charAt(1));// concatenation empty String
            //System.out.println(word.substring(0,2));
        }

    }
}
