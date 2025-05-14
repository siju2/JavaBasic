package hw250514;

public class BookVO {
    private int bookNo;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private int instock;

    public BookVO(int bookNo, String title, String author, String publisher, int price, int instock) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.instock = instock;
    }

    public BookVO(String title, String author, String publisher, int price, int instock) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.instock = instock;
    }

    public BookVO() {}

    public String toString() {
        return "[" + bookNo + ", " + title + ", " + author + ", " + publisher + ", " + price + "]";
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public int getInstock() {
        return instock;
    }

    public void setInstock(int instock) {
        this.instock = instock;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
