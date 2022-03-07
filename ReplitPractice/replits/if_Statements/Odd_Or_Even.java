package replits.if_Statements;

import java.util.Scanner;

public class Odd_Or_Even {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        boolean even = number% 2 == 0;
        boolean odd = !even;
        if(even){
            System.out.println(number+" is even");
        }
        if(odd){
            System.out.println(number+" is odd");
        }

    }
}
/*
Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:

Enter a number:
10

10 is even
Enter a number:
10

10 is even
Enter a number:
33

33 is odd
Enter a number:
33

33 is odd
Enter a number:
0

0 is even
 */