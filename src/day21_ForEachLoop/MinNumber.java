package day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {

        int[] numbers = {100, 500, 30, 40, 600, 80, 90};
        int min = numbers[0];//30 if it is min, so I have to compare with every single character

        // forEachLoop
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
/*
        // regular for loop
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min){// if there is an element in the array that's smaller
                min =numbers[i];// smaller number will be assigned to the variable min
            }

        }

 */
            System.out.println(min);
        }
    }
