package replits.if_Statements;

import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //int num = s.nextInt();
        int num = 7;

        boolean positive = num>1;
        boolean negative = num<0;
        boolean zero = !positive && !negative;

        if(positive){
            System.out.println("num = "+num);
            System.out.println("positive");

        }
        if(negative ){
            System.out.println("num = "+num);
            System.out.println("negative ");

        }
        if(zero){
            System.out.println("num = "+num);
            System.out.println("zero");
        }

    }
}
/*
Given int num check if the number is positive, negative, or zero

Hint: use 3 if statements to do this

Examples:

num  = 1

positive
num  = 1

positive
num = -6

negative
num = -6

negative
num = 0

zero
 */