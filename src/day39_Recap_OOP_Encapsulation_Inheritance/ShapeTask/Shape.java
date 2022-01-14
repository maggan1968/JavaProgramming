package day39_Recap_OOP_Encapsulation_Inheritance.ShapeTask;

public class Shape {

    private  String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }



    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
    }




/*
variable: name

Adda a constructor to set the filed
Encapsulate the filed
Methods:
area(){}
perimeter(){}
 */