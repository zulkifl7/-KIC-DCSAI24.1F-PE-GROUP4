
# Library Management System - Java Swing Application

## Group Members
- **A S A Zulkifl** - KIC-DCSAI-241-F-007
- **B H A T PRABUDDIKA** - KIC-DCSAI-241-F-006

---

## Overview

The **Library Management System** is a standalone Java Swing application designed to manage the borrowing and returning of books in a library. This project focuses on GUI development and application flow without requiring database connectivity. It showcases core functionalities like managing books, borrowing, and returning operations, while adhering to modular and reusable design principles.

## Purpose

The purpose of this project is to develop a Java Swing application as part of an academic assignment. The emphasis is on:
- Building a user-friendly GUI.
- Demonstrating a complete workflow for a real-world business scenario.
- Implementing core application functionality without database connectivity.

## Business Scenario

The **Library Management System** simulates the daily operations of a library, enabling librarians to:
1. Add new books to the system.
2. View the list of books available in the library.
3. Borrow books and update their status as "Not Available."
4. Return books and update their status back to "Available."

This scenario was selected due to its relevance and simplicity, ensuring it can be realistically implemented within the given timeframe.

---

## Features and Navigation Flow

### 1. **Login Screen**
- The application begins with a login screen where users must enter valid credentials to access the system.
- Credentials are hardcoded for simplicity.

### 2. **Menu Screen**
- After successful login, users are navigated to the **Dashboard**, which provides the following options:
  - **Add Book**: Add new books to the system.
  - **View Books**: View a list of all books along with their availability status.
  - **Borrow Book**: Borrow a book and mark it as "Not Available."
  - **Return Book**: Return a borrowed book and mark it as "Available."
  - **Logout**: Return to the login screen.

### 3. **Business-Specific Screens**
#### **Add Book**
- Add details of new books, including:
  - Book Code
  - Book Name
  - Author Name
  - Book Status (Available by default)

#### **View Books**
- Display a list of all books in a tabular format, including:
  - Book Code
  - Book Name
  - Author Name
  - Book Status (Available/Not Available)

#### **Borrow Book**
- List only the available books in a dropdown.
- Allow users to select a book, borrow it, and mark its status as "Not Available."

#### **Return Book**
- List only the borrowed books in a dropdown.
- Allow users to select a book, return it, and mark its status as "Available."

---

## Design and Usability

### Design Principles
1. **User-Friendly GUI**:
   - All screens were built using Java Swing components like `JLabel`, `JButton`, `JComboBox`, `JTable`, and `JTextField`.
   - Clear and intuitive navigation flow for a seamless user experience.

2. **Modularity**:
   - Each functionality is implemented in its own class (e.g., `AddBook`, `BorrowBook`, `ReturnBook`).
   - A `BookManager` singleton class handles the core logic of managing books, ensuring reusability across the application.

---

## Challenges Faced and Solutions

### **Challenge 1: Managing Shared Data Across Screens**
- **Problem**: Ensuring the book data is consistently updated across all screens.
- **Solution**: Implemented a `BookManager` singleton class to manage the book data in memory, allowing all screens to access the same instance.

### **Challenge 2: Dynamic Updates to Dropdowns**
- **Problem**: Keeping the dropdown lists (e.g., available books) updated dynamically after operations like borrowing or returning books.
- **Solution**: Created dedicated methods like `loadAvailableBooks` and `loadUnavailableBooks` to refresh the dropdown lists after each operation.

### **Challenge 3: Input Validation**
- **Problem**: Preventing invalid or incomplete data from being processed.
- **Solution**: Added input validation with appropriate error messages using `JOptionPane`.

---

## How to Run the Project

1. **Prerequisites**:
   - Java Development Kit (JDK) installed.
   - An IDE (e.g., NetBeans, IntelliJ IDEA, Eclipse) for running Java Swing applications.

2. **Steps**:
   - Clone or download the project source code.
   - Open the project in your IDE.
   - Compile and run the `FormLogin` class to start the application.

---

## Application Screenshots

**Login Screen**  
The entry point of the application.

**Dashboard**  
Provides navigation options for all functionalities.

**Add Book Screen**  
Allows librarians to add new books to the system.

**View Books Screen**  
Displays a list of all books and their statuses.

**Borrow Book Screen**  
Lists only available books and allows borrowing.

**Return Book Screen**  
Lists only borrowed books and allows returning.

---

## Future Enhancements

- Add database connectivity for persistent data storage.
- Implement user roles (e.g., Admin, Librarian) for enhanced security.
- Include reporting features, such as borrowed books history.

---

This project demonstrates the ability to create a modular, user-friendly Java Swing application, providing practical functionality for managing a library system.
