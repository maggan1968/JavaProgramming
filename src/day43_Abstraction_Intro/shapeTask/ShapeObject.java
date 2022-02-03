package day43_Abstraction_Intro.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {
        Circle shape1 = new Circle(4.5);
        Rectangle shape2 =  new Rectangle(2.5,2);
        Square shape3 = new Square(5.5);

        System.out.println("shape1 = " + shape1);
        System.out.println(shape2);
        System.out.println(shape3);
    }

}
