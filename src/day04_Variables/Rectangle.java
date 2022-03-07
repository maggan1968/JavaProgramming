package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {

        double width = 5.4;
       double length = 4.6;

       double area = width * length;
       // System.out.println(area);
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);


        double perimeter = 2 * (length + width);
        System.out.println("perimeter = " + perimeter);

       // System.out.println(area);
        //System.out.println(perimeter);

    }
}
/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */