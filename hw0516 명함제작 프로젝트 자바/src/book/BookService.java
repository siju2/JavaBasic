package book;

public class BookService {

    Book[] books;

    public BookService() {
        books = new Book[3];
        books[0] = new Book(1, "김유진", "스타트업 대표", "주식회사 유진", "010-1234-5678", "active");
        books[1] = new Book(2, "이동현", "프론트엔드 개발자", "노벨버스", "010-9876-5432", "active");
        books[2] = new Book(3, "박하영", "디자이너", "해피디자인", "010-5555-6666", "active");
    }

    public void showAllBooks() {
        for (Book b : books) {
            b.printInfo();
        }
    }

    public boolean rentBook(int inputId) {
        for (Book b : books) {
            if (b.getId() == inputId) {
                if (b.getStatus().equals("book")) {
                    b.setStatus("rent");
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean returnBook(int inputId) {
        for (Book b : books) {
            if (b.getId() == inputId) {
                if (b.getStatus().equals("rent")) {
                    b.setStatus("book");
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
