package day43_Abstraction_Intro.ShapeTask;

public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(double length,double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            System.err.println("Invalid Length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            System.err.println("Invalid Width: "+width);
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return length *width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
