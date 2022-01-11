package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        // give me the third character

        String word ="Cydeo";

        char thirdChar = word.charAt(0);
        System.out.println("thirdChar = " + thirdChar);

        System.out.println("====================================================");

        // length() method
        String s1 = "Batch 25 is the best batch";

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        //char lastChar = s1.charAt(totalChars -1);
        char lastChar = s1.charAt(s1.length() -1);// last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("==============================================");

        String str = "wooden spoon";
        str = str.toUpperCase();//"WOODEN SPOON"
//to have upperCase you must asain back
        System.out.println(str);
        //Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);
    }
}
