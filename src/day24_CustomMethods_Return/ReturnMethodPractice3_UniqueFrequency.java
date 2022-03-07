package day24_CustomMethods_Return;

public class ReturnMethodPractice3_UniqueFrequency {

    public static void main(String[] args) {


        //
        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {


            int frequency = frequency(str, str.charAt(i));

            //frequency method helping as to find unique frequency
            if (frequency == 1) {
                System.out.println(str.charAt(i));
            }

        }

    }

    //                              "aaa"      'a'
    public static int frequency(String str, char ch) {
        //on this way we're finding one char from the String
        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;

    }
}

