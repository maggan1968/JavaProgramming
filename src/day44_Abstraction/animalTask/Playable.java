package day44_Abstraction.animalTask;

public interface Playable {

    // static boolean isFriendly = true;//static keyword is not necessary to put there
    boolean isFriendly = true;// static & final by default

   /* public static void method1(){
        System.out.println(isFriendly);
    }
     */


    void play();//abstract by defult

    }

