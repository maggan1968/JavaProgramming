package replits.loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result=1;

        for (int i = n; i >=1 ; i--) {

            result=result*i;


        }
        System.out.println(result);

    }
}
/*
In mathematics a factorial of a positive integer n, denoted by n!,
is the product of all positive integers less than or equal to n.
Calculate factorial and output result to the console.

W matematyce czynnikiem dodatnim liczby całkowitej N,
oznaczony N!, Jest produktem wszystkich dodatnich liczb całkowitych mniejszych lub równych n.
Oblicz fakturę i wynik wyjściowy do konsoli.

Example:

input: 5
output: 120

5 * 4 * 3 * 2 * 1
 */