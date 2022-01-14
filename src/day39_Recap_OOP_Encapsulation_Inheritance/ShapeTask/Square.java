package day39_Recap_OOP_Encapsulation_Inheritance.ShapeTask;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side < 0){
            return;
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString()+
                '}';
    }
}
/*
square extends Shape
Adda a constructor to set the filed
variables:
side;
Encapsulate the field
area():side * side
perimeter(): side *4
toString(): side,area, perimeter
 */