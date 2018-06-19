import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Book book;
    Library library;

//    NAME is on the left and (new) TYPE is on the right below
    @Before
    public void before(){
        book = new Book("POKER FOR LYF", "hobby");
        library = new Library(2);
    }

    @Test
    public void checkBookCount(){
        assertEquals(0, library.countBooks());
        }

        @Test
    public void canAddBooks(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
        }

        @Test
    public void doesntAddBookToLibraryIfCapacityIsFull(){
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            assertEquals(2, library.countBooks());


        }


}



