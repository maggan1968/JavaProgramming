package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Margie", "Adam", "Adam", "Adam", "Cydeo", "Cihad", "Cihad", "Olga"};


        for (String each : words) {// each stands for every element in loop

            int count = 0;

            for (String element : words) {
                if (element.equals(each)) {// we have to compare every single element
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }

        }
    }}
