package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapBookDAO implements projectDAO {

	private Map<Integer, projectVO> bookDB = new HashMap<>();
	private int bookSeq = 111;
	
	@Override
	public boolean insertBook(projectVO book) {
		book.setBookNo(bookSeq++);
		book.setRegdate(new Date());
		return bookDB.put(book.getBookNo(), book) != null;
		
	}

	@Override
	public projectVO selectBook(int bookNo) {
		return bookDB.get(bookNo);
	}

	@Override
	public List<projectVO> selectAllBooks() {
		return new ArrayList<>(bookDB.values());
	}

	@Override
	public boolean updateBook(projectVO newBook) {
		
		//return bookDB.put(newBook.getBookNo(), newBook) != null;
		if (bookDB.put(newBook.getBookNo(), newBook) != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteBook(int bookNo) {
		return bookDB.remove(bookNo) != null;
	}

}
