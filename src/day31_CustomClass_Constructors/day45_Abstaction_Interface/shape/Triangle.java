package day31_CustomClass_Constructors.day45_Abstaction_Interface.shape;

public class Triangle extends Shape{
    public Triangle(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
