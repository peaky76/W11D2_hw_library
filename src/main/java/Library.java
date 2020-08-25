import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;
    int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void add(Book book) {
        if (this.hasSpace()) {
            this.books.add(book);
        }
    }

    public boolean hasSpace() {
        return this.getBookCount() < this.capacity;
    }

    public int getBooksOnLoanCount() {
        int count = 0;
        for (Book book: this.books) {
            if (book.getOnLoan() == true) {
                count += 1;
            }
        }
        return count;
    }

    public void lend(Book book) {
        if (this.books.contains(book) && book.getOnLoan() == false) {
            book.setOnLoan(true);
        }
    }
}
