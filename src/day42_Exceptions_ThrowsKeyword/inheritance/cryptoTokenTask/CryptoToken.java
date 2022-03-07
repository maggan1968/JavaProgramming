package day42_Exceptions_ThrowsKeyword.inheritance.cryptoTokenTask;

public class CryptoToken {

    public double price;
    public int quantity;
    public double marketCap;
    public double volume, circulatingSupply;
    public boolean isMineable;

    public void setInfo(double price, int quantity, double marketCap, double volume,
                       double circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }
    public void totalPrice(){
        System.out.println(price * quantity);
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
CryptoToken Task
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the crypto token ( price * quantity)
 */