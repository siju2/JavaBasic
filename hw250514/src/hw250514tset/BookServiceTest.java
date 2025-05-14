package hw250514tset;

import hw250514.*;

public class BookServiceTest {

    public static void main(String[] args) {

        BookService bs = (BookService) new HJBookService();
        bs.registBook(new BookVO("test", "donghyun", "kopo", 10000 ,10));
        bs.registBook(new BookVO("test2", "curi", "home", 1000, 5));
        bs.registBook(new BookVO("test3", "hye", "home", 3000, 15));

        System.out.println(bs.listBook());
        System.out.println(bs.detailBookInfo(112));

        bs.updateBookInstock(111,15);
        bs.updateBookPrice(112,30000);

        System.out.println(bs.listBook());
        bs.removeBook(113);
        System.out.println(bs.listBook());
    }
}
