import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before() {
        library = new Library(100);
        book1 = new Book("Mr Happy", "Roger Hargreaves", "Horror");
        book2 = new Book("Little Miss Sunshine", "Roger Hargreaves", "Philosophy");
        book3 = new Book("The Gruffalo", "Julia Donaldson", "Philosophy");
    }

    @Test
    public void newLibraryHasNoBooks() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.add(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void checkLibraryHasSpace() {
        for(int i = 0; i < 100; i ++) {
            library.add(book1);
        }
        assertEquals(false, library.hasSpace());
    }

    @Test
    public void newLibraryHasNoBooksOnLoan() {
        assertEquals(0, library.getBooksOnLoanCount());
    }

    @Test
    public void canLoanBook() {
        library.add(book1);
        library.lend(book1);
        assertEquals(1, library.getBooksOnLoanCount());
    }

    @Test
    public void canGetCountByGenre() {
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(2, library.getCountByGenre("Philosophy"));
    }
}
