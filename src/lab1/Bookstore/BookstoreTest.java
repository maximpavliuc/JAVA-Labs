package lab1.Bookstore;

import java.util.Scanner;

public class BookstoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the first book: ");
        String title1 = scanner.nextLine();

        System.out.println("Enter the author of the first book: ");
        String author1 = scanner.nextLine();

        System.out.println("Enter the publisher of the first book: ");
        String publisher1 = scanner.nextLine();

        int pageCount1;
        do {
            System.out.println("Enter the page count of the first book (must be greater than zero): ");
            pageCount1 = scanner.nextInt();
        } while (pageCount1 <= 0);

        Book book1 = new Book(title1, author1, publisher1, pageCount1);
        System.out.println("The book details are: " + System.lineSeparator() + book1.getFormattedInfo());

        System.out.println("Enter the title of the second book: ");
        scanner.nextLine();
        String title2 = scanner.nextLine();

        System.out.println("Enter the author of the second book: ");
        String author2 = scanner.nextLine();

        System.out.println("Enter the publisher of the second book: ");
        String publisher2 = scanner.nextLine();

        int pageCount2;
        do {
            System.out.println("Enter the page count of the second book (must be greater than zero): ");
            pageCount2 = scanner.nextInt();
        } while (pageCount2 <= 0);

        Book book2 = new Book(title2, author2, publisher2, pageCount2);
        System.out.println("The book details are: " + System.lineSeparator() + book2.getFormattedInfo());

        if (BookstoreCheck.isDuplicate(book1, book2)) {
            System.out.println("The books are duplicates.");
        } else {
            System.out.println("The books are not duplicates.");
        }

        Book thickerBook = BookstoreCheck.comparePageCount(book1, book2);
        if (thickerBook != null) {
            System.out.println(thickerBook.getTitle() + " is thicker than " + (thickerBook == book1 ? book2.getTitle() : book1.getTitle()));
        } else {
            System.out.println("The books have the same number of pages.");
        }
    }
}