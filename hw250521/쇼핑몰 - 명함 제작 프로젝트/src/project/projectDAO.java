package project;

import java.util.List;

public interface projectDAO {
	boolean insertBook(projectVO book);
	projectVO selectBook(int bookNo);
	List<projectVO> selectAllBooks();
	boolean updateBook(projectVO newBook);
	boolean deleteBook(int bookNo);
}
