package project;

import java.util.List;

public interface projectService {
	boolean registBook(projectVO book);
	List<projectVO> listBooks();
	projectVO detailBookInfo(int bookNo);
	boolean updateBookPrice(int bookNo, int price);
	boolean updateBookInstock(int bookNo, int instock);
	boolean removeBook(int bookNo);
}
