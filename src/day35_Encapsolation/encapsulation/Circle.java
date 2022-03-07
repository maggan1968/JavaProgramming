package day35_Encapsolation.encapsulation;

public class Circle {

    private double diameter, radius;
    private static final double PI = 3.14;

    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return  diameter;
    }

    public void setRadius(double radius){
        if(radius < 0){
            System.out.println("Radius can not be negative");
            return;
        }
        this.radius  =radius; // r= 3
        diameter = radius * 2;
    }

    public void setDiameter(double diameter){
        if(diameter < 0){
            System.out.println("Diameter of the circle cannot be negative");
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }


    public Circle(double radius) {
        setRadius(radius);
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public boolean equals(Circle circle){
        return radius == circle.radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}

/*
Create a class named Circle

            private
            e variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the radius of circle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()
 */