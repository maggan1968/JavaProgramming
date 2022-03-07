public class ReverseString {
    public static String main(String[] args) {


       String str = "ABCD";



        for(int i=str.length()-1; i>= 0; i--){
          str += str.charAt(i);
        }

        return str;
    }
}

