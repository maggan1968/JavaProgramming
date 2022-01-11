package day17_WhileAndDo_WhileLoops;

public class DoWhileLoop_Intro {
    public static void main(String[] args) {

        boolean a = false;

        for (int i = 0; a;){
            System.out.println("Wooden Spoon -- for loop");
        }
        System.out.println("----------------------------------------------------");

        while (a){ //condition is check in first step
            System.out.println("Wooden Spoon -- while loop"); // if while is false its never executed
        }

        System.out.println("-------------------------------------------------------");

        do{
            System.out.println("Wooden Spoon -- do 0-while loop");//
        }while (a);
    }
}
