package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        // ask user how many numbers you like to enter?

        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers you like to enter?");
        int length = scan.nextInt();//10

        if (length <= 0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
// array needs to have enough capasity to contain all the elements' user going to enter
        int[]numbers= new int[length];// [0,0,0,0,0]- length- the last number in array

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            //each input user provided during each execution of the loop,
            // will be assigned to the indexes of the array
            numbers[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
