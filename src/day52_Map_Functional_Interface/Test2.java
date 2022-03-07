package day52_Map_Functional_Interface;

public class Test2 {
    public static void main(String[] args) {

        //create a function is print each character of the String

        MySecondFunctionalInterface<String>printEach = s -> {

            for (String each : s.split("")) {
                System.out.println(each);

            }
        };
        printEach.test("Wooden Spoon");

        MySecondFunctionalInterface<Integer>cube = n -> System.out.println(n*n*n);
        cube.test(5);





        }

    }

