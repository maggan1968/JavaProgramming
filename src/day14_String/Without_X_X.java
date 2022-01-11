package day14_String;

import java.util.Scanner;

public class Without_X_X {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int lastChar=word.length();
        if(word.substring(0,1).equals("X")
                || word.substring(0,1).equals("X")
                || word.substring(lastChar).equals("x")
                || word.substring(lastChar).equals("X")){
            System.out.println(word.substring(1,lastChar));
        }else{
            System.out.println(word);
        }
    }
}
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi
input: xHiX

output: Hi
input: apple

output: apple
input: apple

output: apple
input: xUxL

output: UxL
input: xUxL

output: UxL
input: JavaX

output: Java
 */