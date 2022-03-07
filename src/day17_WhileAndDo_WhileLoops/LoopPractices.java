package day17_WhileAndDo_WhileLoops;

public class LoopPractices {
    public static void main(String[] args) {
        //print 1~10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        System.out.println("===============================================");

        int j = 1;
        while (j<=10){
           // j++;// starting print from 2 to 11, so Iteration has to be after statement
            System.out.println(j);
            j++;
        }
        System.out.println("=====================================================");

        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while (k<=10);
    }

}
