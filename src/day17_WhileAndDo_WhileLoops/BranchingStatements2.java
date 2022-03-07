package day17_WhileAndDo_WhileLoops;

public class BranchingStatements2 {
    public static void main(String[] args) {

            // A,B,C,D,E
        for (char i = 'A'; i <='E' ; i++) {

            // PRINTING WITHOUT 'C'
            if (i == 'C')
                continue;
            System.out.println(i);

            System.out.println("________________________________________________________");
            //print all even numbers 1~10(skip the odd numbers)

            for (int j = 1; j <=10 ; j++) {

                if (i%2 !=0) { // even numbers
                    continue;
                }
                    System.out.println(j);

            }



            System.out.println("________________________________________________________");
            //print all odd numbers 1~10(skip the even numbers)

            for (int k = 1; k <= 10 ; k++) {
                if (k%2==0){
                    continue;
                }
                System.out.println(k);
            }

        }
    }
}
