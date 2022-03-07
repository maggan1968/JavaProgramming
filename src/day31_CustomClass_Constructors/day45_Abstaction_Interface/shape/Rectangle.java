package day31_CustomClass_Constructors.day45_Abstaction_Interface.shape;

public class Rectangle extends Square{


    public Rectangle(double side) {
        super(side);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }
}



