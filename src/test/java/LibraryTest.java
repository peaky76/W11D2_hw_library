import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Mr Happy", "Roger Hargreaves", "Horror");
    }

    @Test
    public void newLibraryHasNoBooks() {
        assertEquals(0, library.getBookCount());
    }
}
