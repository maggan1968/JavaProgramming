package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
//in this way you can find every single characters
        String str ="aabccdeef";
        String result = "";//bdf

/*this way you will find the one character
        char ch = 'a';
        int count = 0;// represents the frequency of the ch

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);// each character of str
            if (ch == each){
                count++;
            }
        }
        System.out.println(count);*/

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;// represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character
                char each = str.charAt(i);// each character of str
                if (ch == each) {
                    count++;
                    //after you find the character, witch is the unique?
                }

            }
           /* if (count == 1) {// if the frequency of the character is 1, then the character is unique
                result += ch;*/
            if (count!=1){ //if  is count!>1 is duplicate
                continue;
            }
            result += ch;
        }
        System.out.println(result);

    }
}
/*
Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */