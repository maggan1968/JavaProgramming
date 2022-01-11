package day36_Inheritance.inheritance.bookTask;

public class AudioBook extends Book {

    public String title;
    public String type;
    public  String author;
    public double price;
    public int length;
    public String narrator;

    public void setInfo(String title, String type, String author, double price, int length, String narrator) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.length = length;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println("Im listening to" + title);
    }

    public String toString() {
        return "AudioBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
/*
3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */