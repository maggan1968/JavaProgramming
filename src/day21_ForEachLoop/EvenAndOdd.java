package day21_ForEachLoop;

public class EvenAndOdd {
    public static void main(String[] args) {

        int[]numbers= {1, 23, 45,6,23};

        int countEven = 0;
        int countOdd = 0;

        for (int each : numbers) {
            if (each%2==0) {
                countEven++;
            }else {
                countOdd++;
            }
        }
        System.out.println("even: "+ countEven + " odd: " + countOdd);
    }
}
/*
 Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */