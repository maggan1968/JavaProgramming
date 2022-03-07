package Day15_ForLoop;

public class SumOfIntegers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 ==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
/*
Write a program that can calculate the sum of all integers between 1 to 100
 */