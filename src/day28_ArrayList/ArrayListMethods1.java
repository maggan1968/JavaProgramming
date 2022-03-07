package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


// add() method
//                                   object of ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//index 0//0//0
        numbers.add(20);//1//1//1
        numbers.add(30);//2//3//3
        numbers.add(40);//3//4//4
        numbers.add(50);//4//5//6

        numbers.add(2,25);//2
        numbers.add(5, 45);//5


        System.out.println(numbers);

// size()
        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);


// get(index);

       int num =numbers.get(3);// return Integer class
        System.out.println("num = " + num);


        System.out.println("----------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
            System.out.println("-------------------------------------");
//set(index);
            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("Java");
            list.add("C#");
            list.add("Ruby");

            list.set(2,"JavaScript");//replace
            list.set(2,"C#");

            System.out.println(list);

        System.out.println("----------------------------------------");

 //remove(index);


        ArrayList<String> employees = new ArrayList<>();
        employees.add("Margie");
        employees.add("Ola");
        employees.add("Maria");
        employees.add("Albert");
        employees.add("Muhtar");
        employees.add("Hulya");
        employees.add("Aziza");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(employees.size()-1);//remove last index
        System.out.println(employees);
 //remove(object);

       employees.remove("Hulya");
        System.out.println(employees);

       boolean r1 = employees.remove("Albert");
       boolean r2 = employees.remove("Maria");
       boolean r3 =employees.remove("Muhtar");
        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        }
    }

