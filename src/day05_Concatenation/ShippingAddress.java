package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Margie";
        String buildingNumber = "B456";
        String streetName = " Linder ave.";
        String city = "Chicago";
        String state = "IL";
        String zipCode = " A45-376";


       // System.out.println(name + "\n" + buildingNumber+"" +
              //  streetName + "\n" + city +"," + state + ""+ zipCode);
String  address = name + "\n" + buildingNumber+"" +
        streetName + "\n" + city +"," + state + ""+ zipCode;

        System.out.println(address);
    }
}
/*
Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
3. Use concatenation to print the full address
 */