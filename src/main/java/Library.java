import java.util.ArrayList;

public class Library {

    //    Write a method to count the number of books in the library.
//    Write a method to add a book to the library stock.
//    Add a capacity to the library and write a method to check if stock is full before adding a book.

    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }


    public int getBookCount() {
        return this.books.size();
    }
}
