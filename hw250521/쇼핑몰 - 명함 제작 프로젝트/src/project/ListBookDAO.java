package	project;

import java.util.LinkedList;
import java.util.List;

public class ListBookDAO implements projectDAO {

	private List<projectVO> bookList = new LinkedList<projectVO>();
	private int bookSeq = 111; // 책번호 1씩 증가
	
	@Override
	public boolean insertBook(projectVO book) {
		book.setBookNo(bookSeq++);
		bookList.add(book);
		return true;
	}

	@Override
	public projectVO selectBook(int bookNo) {
		for (projectVO book : bookList) {
			if (book.getBookNo() == bookNo)
				return book;
		}
		return null;
	}

	@Override
	public List<projectVO> selectAllBooks() {
		return bookList;
	}

	@Override
	public boolean updateBook(projectVO newBook) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getBookNo() == newBook.getBookNo()) {
				bookList.set(i, newBook);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteBook(int bookNo) {

		for (projectVO book : bookList) {
			if (book.getBookNo() == bookNo) {
				bookList.remove(book);
				return true;
			}
		}
		return false;
	}

}
