import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(100);
        book = new Book("Mr Happy", "Roger Hargreaves", "Horror");
    }

    @Test
    public void newLibraryHasNoBooks() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.add(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void checkLibraryHasSpace() {
        for(int i = 0; i < 100; i ++) {
            library.add(book);
        }
        assertEquals(false, library.hasSpace());
    }

    @Test
    public void newLibraryHasNoBooksOnLoan() {
        assertEquals(0, library.getBooksOnLoanCount());
    }

    @Test
    public void canLoanBook() {
        library.add(book);
        library.lend(book);
        assertEquals(1, library.getBooksOnLoanCount());
    }
}
