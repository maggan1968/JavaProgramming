package Day15_ForLoop;

public class ForLoop_Intro {
    public static void main(String[] args) {

//x10 statements
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("=============================");

        //initialization and condition is mandatory
       // if you don't use Iterator, loop will print Infinitive
        // first initialization is executed then condition and Iterator

        //       1             2          4
        // initialization;  condition;  Iterator
        for (int i =1;       i <=10;     i++    ){//i:1,2,3,4,5,6,7,8,9,10,11
            System.out.println("Hello World");//i:1,2,3,4,5,6,7,8,9,10
        }
    }
}
