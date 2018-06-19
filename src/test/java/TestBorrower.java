import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Book book;
    Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Adri");

    }

    @Test
    public void borrowerHasNoBook(){
        assertEquals(1, borrower.bookCount());
    }

}
