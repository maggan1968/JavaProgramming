package day32_Constructors.CarTask;

import day32_Constructors.CarTask.Car;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Accord");
        Car car3 = new Car("Subaru", "Crosstrack",2013);
        Car car4 = new Car("BMW", "X5",2021,50000);
        Car car5 = new Car("Tesla", "Model 3",2020,70000, "red");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
