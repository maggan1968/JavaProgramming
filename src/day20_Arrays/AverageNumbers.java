package day20_Arrays;

public class AverageNumbers {
    public static void main(String[] args) {

     //how we can find average number
        int[] numbers = {10,20,3,40,50,60};

        double sum = 0;//10+20+30...
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];//each number

        }
        double averageNumber = sum / numbers.length;
        System.out.println("averageNumber = " + averageNumber);


    }
}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */