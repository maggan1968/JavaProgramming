package Day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        double sum = 0;
        //1+2+3+4....+100

        for (int i = 1; i <101 ; i++) {// shortcut :fori
            sum +=i;

        }
        System.out.println(sum);


        System.out.println("======================================");

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");// this statement will be repeated 5 times
            total += scan.nextInt();
        }

        System.out.println("total = " + total);
        scan.close();

    }
}
