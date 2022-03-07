package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota= new Toyota("Camry", 2010, 5000, "White", 200000);
        toyota.start();


        Tesla tesla = new Tesla("S model",2021,120000,"Black",0);
        tesla.start();



        BMW bmw = new BMW("X 6",2021, 210000, "White", 0);
        bmw.start();



    }
}
