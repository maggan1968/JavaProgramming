package day36_Inheritance.inheritance.cryptoTokenTask;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin= new Bitcoin();
        bitcoin.setInfo(4260.9, 12,811.661,29.13,
                18.90000000,true);
        bitcoin.totalPrice();
        System.out.println("bitcoin = " + bitcoin);


        Ethereum ethereum= new Ethereum();
        ethereum.setInfo(3349.25,11,404.154,22.04,
                119.054000,true);
        ethereum.totalPrice();
        System.out.println("ethereum = " + ethereum);


        Cardano cardano= new Cardano();
        cardano.setInfo(1.26, 101,40.308,1.357,
                32.0660000,false);
        cardano.totalPrice();
        System.out.println("cardano = " + cardano);


        DogeCoin dogeCoin=new DogeCoin();
        dogeCoin.setInfo(0.16,45,20.963, 702.367,
                132.67,true);
        dogeCoin.totalPrice();
        System.out.println("dogeCoin = " + dogeCoin);


        XRP xrp= new XRP();
        xrp.setInfo(0.77, 243,10.00000000, 18.71,
                47.577,false);
        xrp.totalPrice();
        System.out.println("xrp = " + xrp);




        /*
        create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
         */
    }
}
