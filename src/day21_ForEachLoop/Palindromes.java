package day21_ForEachLoop;

public class Palindromes {
    public static void main(String[] args) {

        String[] words = {"anna", "level", "Java"};
        int countOfPalindrome = 0;
        for (String each : words) {

            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

                if (each.equals(reverse)) {
                    countOfPalindrome++;
                }

            }
        }
        System.out.println("countOfPalindrome = " + countOfPalindrome);
    }
}




/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */