package hw250514;

import java.util.LinkedList;
import java.util.List;

public class ListBookDAO implements BookDAO{
	
	List<BookVO> bookList = new LinkedList<BookVO>();
	private int bookSeq = 111;//1씩증가.
	
	@Override
	public boolean insertBook(BookVO book) {
		book.setBookNo(bookSeq++);
	
		return true;
	}
	
	@Override
	public BookVO selectBook(int bookNo) {
		for(BookVO book : bookList) {
			if(book.getBookNo() == bookNo)
				return book;
		}
		
		
		return null;
	}
	
	@Override
	public List<BookVO> selectAllBooks(){
		return bookList;
	}
	@Override
	public boolean updateBook(BookVO book) {
	    for (int i = 0; i < bookList.size(); i++) {
	        if (bookList.get(i).getBookNo() == book.getBookNo()) {
	            bookList.set(i, book);
	            return true;
	        }
	    }
	    
	    return false;
		
	}
	
	@Override
	public boolean deleteBook(int bookNo) {
	
		for(BookVO book:bookList) {
			if(book.getBookNo() == bookNo) {
				bookList.remove(book);
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
