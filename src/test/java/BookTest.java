import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

//    Books should have title, author and genre.
//    Write a method to count the number of books in the library.
//    Write a method to add a book to the library stock.
//    Add a capacity to the library and write a method to check if stock is full before adding a book.

    Book book;

    @Before
    public void before() {
        book = new Book("Mr Happy", "Roger Hargreaves", "Horror");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Mr Happy", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Roger Hargreaves", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Horror", book.getGenre());
    }

}
