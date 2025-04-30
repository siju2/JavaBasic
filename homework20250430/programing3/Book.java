package programing3;

public class Book implements Comparable<Book> {
	
    int price;

    public Book(int price) {
    	
        this.price = price;
        
    }

    @Override
    public String toString() {
    	
        return "Book [price=" + price + "]";
        
    }

    @Override
    public int compareTo(Book other) {
        if (this.price < other.price) return -1;
        else if (this.price > other.price) return 1;
        else return 0;
    }
}