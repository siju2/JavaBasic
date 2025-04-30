package programing3;

import java.util.Arrays;

public class BookTest {
	
    public static void main(String[] args) {
    	
        Book[] books = {
        		
            new Book(50000),
            new Book(20000),
            new Book(15000)
            
        };

        System.out.println("정렬 전");
        
        for (Book b : books) {
            System.out.println(b);
        }

        Arrays.sort(books);

        System.out.println("\n정렬 후");
        
        for (Book b : books) {
            System.out.println(b);
            
        }
    }
}
