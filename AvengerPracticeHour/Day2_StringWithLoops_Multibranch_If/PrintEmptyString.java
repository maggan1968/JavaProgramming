package Day2_StringWithLoops_Multibranch_If;

public class PrintEmptyString {
    public static void main(String[] args) {

        String word = "redxx";
        String result = "";

        if (word.startsWith("red")) {
            result = "\"red\"";


        } else if (word.startsWith("blue")) {
            result = "\"blue\"";

        } else {
            result = "\"";
        }
        System.out.println("result = " + result);
    }
}
/*
2.
                Given a string, if the string begins with "red" or "blue" print that color string,
                otherwise print the empty string.

                input :"redxx" → "red"
                input :"xxred" → ""
                input :"blueTimes" → "blue"
 */