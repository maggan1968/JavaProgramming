package day35_Encapsolation.encapsulation;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side < 0){
            return;
        }
        this.side = side;
    }

    public double area(){
        return side * side ;
    }

    public double perimeter(){
        return 4 * side;
    }

    public boolean equals(Square square){
        return side == square.getSide();
    }

    public String toString() {
        return "Square{" +
                "side= " + getSide() +
                "area= " + area() +
                "perimeter= " + perimeter() +
                '}';
    }

}

/*
 Square Task:
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement
 */