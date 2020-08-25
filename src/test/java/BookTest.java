import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

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
