package service;


import java.util.ArrayList;

public class BookManager {
    private static BookManager instance; // Singleton instance
    private ArrayList<Book> books;       // Shared list of books

    // Private constructor to prevent direct instantiation
    private BookManager() {
        books = new ArrayList<>();

        // Populate the list with predefined book data
        books.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", 0));
        books.add(new Book("B002", "1984", "George Orwell", 1));
        books.add(new Book("B003", "To Kill a Mockingbird", "Harper Lee", 0));
        books.add(new Book("B004", "Pride and Prejudice", "Jane Austen", 0));
        books.add(new Book("B005", "The Hobbit", "J.R.R. Tolkien", 1));
    }

    // Public method to get the singleton instance
    public static BookManager getInstance() {
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    // Get all books
    public ArrayList<Book> getAllBooks() {
        return books;
    }

    // Find a book by code
    public Book findBookByCode(String bookCode) {
        for (Book book : books) {
            if (book.getBookCode().equalsIgnoreCase(bookCode)) {
                return book;
            }
        }
        return null;
    }

    // Update book status
    public boolean updateBookStatus(String bookCode, int status) {
        Book book = findBookByCode(bookCode);
        if (book != null) {
            book.setBookStatus(status);
            return true;
        }
        return false;
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
    }

    // Delete a book
    public boolean deleteBook(String bookCode) {
        Book book = findBookByCode(bookCode);
        if (book != null) {
            books.remove(book);
            return true;
        }
        return false;
    }
}
