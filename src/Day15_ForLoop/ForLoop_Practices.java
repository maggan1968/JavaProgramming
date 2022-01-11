package Day15_ForLoop;

public class ForLoop_Practices {
    public static void main(String[] args) {
        //15 16 17 18....25
        for (int i = 15; i <= 25; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("=================================");

        //100 95 90 85...50
        for (int i = 100; i >= 50; i -= 5) {//i:100 95 90 85...50 ( >= grade and equal
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("========================================");

        //print all the even numbers between 1~55

        for (int i = 1; i <= 55; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("==================================================");

        //print all the even numbers between 1~55: 2,4,6,8...54

        for (int i = 2; i <= 54; i += 2) {
            System.out.print(i + " ");
        }
    }
}
