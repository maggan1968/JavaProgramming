package Day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "   ";// its blank
        boolean r = str.isEmpty();
        System.out.println(r);

      // boolean r1 = str.isBlank(); its from Java 11
      //  System.out.println(r1);

        String str2 = "Cydeo";
      //  System.out.println(str2.isBlank()); it from Java 11

        System.out.println("=====================================================");
// equals
        //equalsIgnoreCase

        String s1= "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equalsIgnoreCase(s2));//true

        //Yes, YES, yES,YEs,yEs....
        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("============================================");

        //contains
        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java");//jAvA

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);

        System.out.println("==================================================");
        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));//true

        System.out.println(input1.toLowerCase().contains("java"));// true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("-----------------------------");
        String a = "Wooden Spoon"; //"wooden spoon"

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first create the lower case/upper case version of string and then compare it with lowercase/uppercase

        System.out.println(x);
        System.out.println(y);


    }
}
