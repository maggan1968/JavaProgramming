package day41_Exception_Intro;

public class MorningWorkOut {
    public static void main(String[] args) {

        int pushUp=30;
        int pullUp=20;

        try {
            for (int i = 1; i <= pushUp; i++) {
                System.out.println("Do push up "+i);
                Thread.sleep(1000);
            }
            System.out.println("----------------------");
            System.out.println("Push ups Done, easy");
            System.out.println("----------------------");

            for (int i = 1; i <=pullUp ; i++) {
                System.out.println("Do pull up "+i);
                Thread.sleep(2500);
            }
            System.out.println("----------------------");
            System.out.println("Pull ups done, easy");
            System.out.println("----------------------");

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
                         //2.5
public static void sleep(double seconds)  {

    try {
        Thread.sleep((long)(seconds*1000));
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
    }
/*
  System.out.println("------------Push up started----------");

        for (int i = 1; i <= 30 ; i++) {

            System.out.print("\rPush up "+i);

                sleep(1.5);

        }

        System.out.println("\n------------Push ups completed----------");

        System.out.println("------------Pull up started----------");

        for (int i = 1; i <= 20 ; i++) {

            System.out.print("\rPull up "+i);
               sleep(2.5);
        }

        System.out.println("\n------------Pull ups completed----------");

 */




/*
MorningWorkOut:
        1. Do 30 push-ups and try pausing 1.5 seconds in each


        2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */