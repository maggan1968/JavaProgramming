package day33_Statics;

public class Employee {

    //name,salary can't be static, must have more cope not just one.
    // in this everyone will have the same name
    //Names,salary has to be instanced, so everyone has different names
    //public static String name;
    public String name;
    //public static double salary;
    public double salary;

    public static boolean isHuman = true;
}
