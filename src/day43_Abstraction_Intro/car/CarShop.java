package day43_Abstraction_Intro.car;

public abstract class CarShop {
    public static void main(String[] args) {


        //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // we can not create object from Abstract class, because abstract class is not concrete


        Honda honda = new Honda("Honda", "Accord", 2019, 30000, "Blue");



        Tesla tesla = new Tesla(18000, "White");

        System.out.println(honda);

        System.out.println(tesla);

        System.out.println("------------------------------------");

        honda.setColor("Red");
        tesla.setColor("Green");

        honda.setPrice(25000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(tesla);



    }

}
