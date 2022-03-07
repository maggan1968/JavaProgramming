package day18_Nested_Loop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //bdf //declare variable

       //2
        for (int j = 0; j < str.length(); j++) {

//1.must find first character, so I must find frequency of each character

            char ch = str.charAt(j);
        int count = 0; //represents the frequency of the char

        for (int i = 0; i < str.length(); i++) {// compare the character that outer loop picked, with each character
            char each = str.charAt(i); // represents the frequency of the str
            if (ch == each) {
                count++;
            }
        }



/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
 */
            if(count != 1){
                continue;
            }

            result += ch;

        }


        System.out.println(result);

    }
}
/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output:
                                bdf
            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */


