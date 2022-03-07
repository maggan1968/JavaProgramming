package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Mazda";
        car1.model = "R5";
        car1.color = "Black";
        car1.year = 2021;
        car1.price = 35000;

        Car car2 = new Car();

        car2.brand = "Fiat";
        car2.model = "126p";
        car2.color = "White";
        car2.year = 1971;
        car2.price = 1200;

        Car car3 = new Car();

        car3.brand = "BMW";
        car3.model = "7";
        car3.color = "Black";
        car3.year = 2021;
        car3.price = 120000;

        Car car4 = new Car();
        car4.setInfo("Subaru", "Crosscreak", "Silver", 2021, 45000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        car1.drive();
        car2.start();
        car3.stop();
        car4.drive();

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3, car4));

        for ( Car each:carsList ) {
            System.out.println(each.brand +" : "+each.price);

        }
        System.out.println("----------------------------------------");

        /*
        re-call
        BMW: 2005~2008
        Mazda: 1995~1997
         */

        carsList.removeIf( p-> p.brand.equals("BMW") && p.year >= 2005 && p.year<=2008);
        carsList.removeIf( p -> p.brand.equals("Mazda") && p.year >=1995 && p.year<=1997);
}}
