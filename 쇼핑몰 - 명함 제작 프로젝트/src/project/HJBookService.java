package project;

import java.util.List;

public class HJBookService implements projectService {

	private projectDAO bookDAO;
	
	public HJBookService(projectDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	@Override
	public boolean registBook(projectVO book) {
		return bookDAO.insertBook(book);
	}

	@Override
	public List<projectVO> listBooks() {
		return bookDAO.selectAllBooks();
	}

	@Override
	public projectVO detailBookInfo(int bookNo) {
		
		return bookDAO.selectBook(bookNo);
	}

	@Override
	public boolean updateBookPrice(int bookNo, int price) {
		projectVO book = bookDAO.selectBook(bookNo);
		
		if (book != null) {
			book.setPrice(price);
			bookDAO.updateBook(book);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateBookInstock(int bookNo, int instock) {
		projectVO book = bookDAO.selectBook(bookNo);
		
		if (book != null) {
			book.setInstock(instock);
			bookDAO.updateBook(book);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean removeBook(int bookNo) {
		/*
		BookVO book = bookDAO.selectBook(bookNo);
		if (book != null) {
			bookDAO.deleteBook(bookNo);
			return true;
		}
		return false;
		 */
		return bookDAO.deleteBook(bookNo);		
	}

}
