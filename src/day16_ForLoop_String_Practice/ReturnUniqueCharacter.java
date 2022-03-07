package day16_ForLoop_String_Practice;

import javax.sound.midi.Soundbank;

public class ReturnUniqueCharacter {
    public static void main(String[] args) {

        String str = "aaabccc";

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            char ch = str.charAt(i); // a, a, b, c, c ch: each characters of str
            boolean isUnique = str.indexOf(ch) == str.lastIndexOf(ch);
            //  if the first and last index numbers of the character are same , then the character is unique

            if (isUnique) { // if the character is unique
                result += ch;

                if (str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index numbers of the character are same, then the character is unique
                    result += ch;
                }

            }

            System.out.println(result);
        }
    }
}



/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */