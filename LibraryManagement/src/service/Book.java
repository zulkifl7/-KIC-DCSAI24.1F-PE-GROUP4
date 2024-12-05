package service;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes
    private String bookCode;

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }
    private String bookName;
    private String bookAuthor;
    private int bookStatus; // 0 - Available, 1 - Not Available

    public Book(String bookCode, String bookName, String bookAuthor, int bookStatus) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookStatus = bookStatus;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Book [Code=" + bookCode + ", Name=" + bookName + ", Author=" + bookAuthor +
               ", Status=" + (bookStatus == 0 ? "Available" : "Not Available") + "]";
    }
}
