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
}
