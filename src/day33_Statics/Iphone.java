package day33_Statics;

public class Iphone {

    public static String brand = "Apple";// static -only one copy
    public String model;//instance belongs to object- called tru the object
    public double price;//instance
    public static String operatingSystem = "iOS";//static
    public String color;//instance
    public String size;//instance
    public static String madeIn = "China";
    public static boolean hasBattery = true;// static belongs to the class -called tru the class
    public static boolean isTouchScreen = true;//static
    public static boolean hasFaceTime = true;// static
    public static void printOperatingSystem(){
        System.out.println(operatingSystem);

    }
   // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price);// static methods does not accept instances

public void method1(){
    System.out.println(model+" : "+price);
    System.out.println(operatingSystem);
}
}
