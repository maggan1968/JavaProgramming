package day43_Abstraction_Intro.ShapeTask;

public abstract class Shape {

    private String name;

    public Shape(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new RuntimeException("Invalid entry");
        }

        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area= "+ area() +'\''+
                ", perimeter= "+ perimeter()+'\''+
                '}';
    }
}
/*
Shape task:

	Shape:
		name

		Encapsulate the fields

		Add constructor to set the fields

		area()
		perimeter()
		toString(): name, area, perimeter


	Create the following subclasses of Shape and add the additional features that are needed:

				Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)

				Square:
					area(): s * s
					perimeter: 4 * s

				Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi
 */

