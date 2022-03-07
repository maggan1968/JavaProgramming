package day39_Recap_OOP_Encapsulation_Inheritance.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

Square square= new Square(10);
System.out.println(square);


square.setSide(20);
System.out.println(square);

        System.out.println("================================");

Rectangle rectangle = new Rectangle(10,37);
System.out.println(rectangle);

rectangle.setLength(5);
rectangle.setWidth(6);

System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("=======================================");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        //circle.radius = 15.5;

        circle.setRadius(15.5);

        System.out.println( circle.getRadius() );

        System.out.println(circle);

        System.out.println(circle.getName());

    }
}
