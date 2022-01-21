package day41_Exception_Intro;

public class TryCatchBlocks {

    public static void main(String[] args) {
        System.out.println("Test started");

        try{
            System.out.println(9/0);

        }catch(ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");
        }

        System.out.println("Test Completed");


        System.out.println("------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5,};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

       // } catch(NullPointerException e) {
        } catch(RuntimeException e) {

            e.printStackTrace();

          //  System.out.println("Catch Block");

          //  System.out.println("Null Pointer exception was occurred");

           // System.out.println(e.getMessage());
        }

        System.out.println("Test2 Completed");

        System.out.println("---------------------------------------");

        System.out.println("Test3 started");


         try {
             System.out.println("Cydeo".substring(2, 0));
         }catch (RuntimeException e){
              e.printStackTrace();
         }
        System.out.println("Test3 Completed");

        System.out.println("-------------------------------");










    }
}
