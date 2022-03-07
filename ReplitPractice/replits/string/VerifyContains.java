package replits.string;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence =scan.nextLine();

        boolean isContains;
        if (sentence.contains(word)){
           isContains = true;
        }else {
            isContains = false;
        }
        System.out.println(isContains);
    }
}
   /*
    Write a program that will verify if the sentence contains word.
     Print out the result as a boolean value.
    */