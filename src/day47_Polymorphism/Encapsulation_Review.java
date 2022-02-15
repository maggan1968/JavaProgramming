package day47_Polymorphism;

public class Encapsulation_Review {

    private String bookTitle;
    private final String publishData;

    public Encapsulation_Review(String bookTitle, String publishData) {
        //this.bookTitle = bookTitle;
        setBookTitle(bookTitle);
        this.publishData = publishData;
    }

    public String getBookTitle() {
        if (bookTitle==null){
            return "";// condition to prevent null
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle==null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishData() {
        return publishData;
    }
}
