import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> booksOnLoan;

    public Borrower() {
        this.booksOnLoan = new ArrayList<Book>();
    }

    public int getBooksCount() {
        return this.booksOnLoan.size();
    }
}
