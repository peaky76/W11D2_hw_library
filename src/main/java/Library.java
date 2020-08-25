import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, Integer> getBooksByGenre() {
        HashMap<String, Integer> booksByGenre = new HashMap<String, Integer>();

        for (Book book: this.books) {
            String genre = book.getGenre();
            Integer count = booksByGenre.get(genre);
            if (count == null) {
                booksByGenre.put(book.getGenre(), 1);
            }
            else {
                booksByGenre.put(book.getGenre(), count + 1);
            }
        }
        return booksByGenre;
    }

    public int getCountByGenre(String genre) {
        return getBooksByGenre().get(genre);
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
