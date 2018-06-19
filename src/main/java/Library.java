import java.util.ArrayList;

    // created a an array (list) of type Book(refers to .java file) called libraryBooks
public class Library {

    private ArrayList<Book> libraryBooks;
    private int capacity;


    // constructor below, this is a template for the properties of library
    // this.(anything) = (anything)... one on the left uses the current class you are in and
    // the one on the right is pulled in from anywhere you call it

    public Library(int capacity) {
        this.libraryBooks = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.libraryBooks.size();
    }

    // below we pass in the book type and the book name (Book book) because we added a book
    // to library in the test function canAddBook, (library.addBook(book)
    public void addBook(Book book) {
        if (countBooks() < capacity) {
            this.libraryBooks.add(book);
        }
    }

}
