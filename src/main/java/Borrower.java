import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> booksOnLoan;

    public Borrower() {
        this.booksOnLoan = new ArrayList<Book>();
    }

    public int getBooksCount() {
        return this.booksOnLoan.size();
    }

    public void borrow(Book book, Library library) {
        library.lend(book);
        this.booksOnLoan.add(book);
    }
}
