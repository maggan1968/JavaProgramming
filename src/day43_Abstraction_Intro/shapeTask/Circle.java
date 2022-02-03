package day43_Abstraction_Intro.shapeTask;

public class Circle extends Shape {



    public final double pI = 3.14;
    private double r;

    public Circle(double r) {
        super("Circle");
        setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r <= 0) {
            throw new RuntimeException("Invalid entry " + r);
        }


        this.r = r;
    }

    @Override
    public double area() {
        return r * r * pI;
    }

    @Override
    public double perimeter() {
        return 2 * pI * r;
    }
}