package day42_Exceptions_ThrowsKeyword.inheritance.bookTask;

public class EBook extends Book{

    public String title;
    public String type;
    public  String author;
    public double price;
    public String size;
    public int pages;

    public void setInfo(String title, String type, String author, double price, String size, int pages) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.size = size;
        this.pages = pages;
    }
    public void readBook(){
        System.out.println(title+ "is reading book");
    }

    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */