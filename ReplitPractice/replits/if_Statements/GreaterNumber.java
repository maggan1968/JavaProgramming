package replits.if_Statements;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        //WRITE YOUR CODE HERE:
        if(a>b){
            System.out.println(a+" is greater");

        }

        if(b>a){
            System.out.println(b+" is greater");
        }


    }
}
/*
Use an if statement to determine if a or b is bigger. Then print:

$number is greater

Examples:

a=1
b=2

output:
2 is greater
a=1
b=2

output:
2 is greater
a=5
b=7

output:
7 is greater
 */