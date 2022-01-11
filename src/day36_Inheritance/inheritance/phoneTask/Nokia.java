package day36_Inheritance.inheritance.phoneTask;

public class Nokia extends Phone {


    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }




    public void call(long phoneNumber){
        System.out.println(brand + " is calling" + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " is texting" + phoneNumber);
    }

    public void selfDefense(){
        System.out.println( brand + " is self defense" );
    }



    }

/*
1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */