import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

//    Add a third class which interacts with the other two.
//    E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("Mr Happy", "Roger Hargreaves", "Horror");
        library = new Library(100);
    }

    @Test
    public void newBorrowerHasNoBooksOnLoan() {
        assertEquals(0, borrower.getBooksCount());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrow(book, library);
        assertEquals(1, borrower.getBooksCount());
    }

}
