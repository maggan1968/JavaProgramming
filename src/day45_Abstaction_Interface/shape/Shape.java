package day45_Abstaction_Interface.shape;

public abstract class Shape {


    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract  double area(); // we dont have any shape methods to all shapes, that we use abstract

    public  abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

