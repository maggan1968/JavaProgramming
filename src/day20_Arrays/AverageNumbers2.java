package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Ask the user how many numbers they want to enter
        System.out.println("how many numbers you want to enter");
        int length= scan.nextInt();

        if (length <=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        int[]numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter Number");
            numbers[i]= scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {10,20,3,40,50,60};

        double sum = 0;//10+20+30...
        for (int i = 0; i < numbers2.length; i++) {
            sum+=numbers2[i];//each number

        }
        double averageNumber = sum / numbers2.length;
        System.out.println("averageNumber = " + averageNumber);


    }
}
/*
AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */