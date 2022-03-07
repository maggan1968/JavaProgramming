package day16_ForLoop_String_Practice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo1234School!0) (@#$%WoodenSpoon";

        String digits = "";//1234
        String letters = ""; //CydeoWodenSpoon";
        String specialChars = ""; // !@#$%

        for (int i = 0; i < str.length(); i++) {//: index numbers of str(0~last index

            char ch = str.charAt(i);// ch: every each character that we have in str

            if (ch >= '0' && ch <= '9') { // ift  the characters between '0' to '9' then it's digit
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') { // ift  the characters between 'A' to 'Z' then it's letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {// ift  the characters between 'a' to 'z' then it's letter
                letters += ch;
            } else { // if the character is neither digit not letter, then it's special character
                if (ch != ' ') {// if the special character is not a space
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
            System.out.println("specialChars = " + specialChars);
    }
}
