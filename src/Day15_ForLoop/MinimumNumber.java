package Day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {



            Scanner scan = new Scanner(System.in);
            int min = 2147483647; // any user entered number will be less than 2147483647
            // min = 5

            for (int i = 0; i < 5; i++) { // 5 times

                System.out.println("Enter a number");
                int number = scan.nextInt();  // 100  300  50  400  5

                if(number < min){ // if user entered a smaller number
                    min = number; // we will only replace min value if the user entered number is smaller
                }

            }

            System.out.println("min = " + min);

            scan.close();

        }
}
/*
Write a program that ask the user to enter a number for 5 times.
return the minimum number
 */