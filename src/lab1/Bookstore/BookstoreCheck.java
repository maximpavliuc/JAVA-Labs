package lab1.Bookstore;

public class BookstoreCheck {
    public static boolean isDuplicate(Book book1, Book book2) {
        return book1.getTitle().equals(book2.getTitle()) && book1.getAuthor().equals(book2.getAuthor());
    }

    public static Book comparePageCount(Book book1, Book book2) {
        if (book1.getPageCount() > book2.getPageCount()) {
            return book1;
        } else if (book1.getPageCount() < book2.getPageCount()) {
            return book2;
        } else {
            return null;
        }
    }
}