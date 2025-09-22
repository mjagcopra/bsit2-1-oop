public class Library {
    private Book[] books = new Book[10];
    private int bookCount = 0;

    public boolean addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
            return true;
        }
        System.out.println("Library is full. Cannot add more books.");
        return false;
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;
                return true;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
        return false;
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) return books[i];
        }
        return null;
    }

    public boolean borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return false;
        }
        System.out.println("Borrowing " + book.getTitle() + "...");
        boolean success = book.borrowBook();
        System.out.println(success ? "Book borrowed successfully!" : "Book is not available for borrowing.");
        return success;
    }

    public boolean returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return false;
        }
        System.out.println("Returning " + book.getTitle() + "...");
        boolean success = book.returnBook();
        System.out.println(success ? "Book returned successfully!" : "Book was not borrowed.");
        return success;
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        boolean anyAvailable = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
                anyAvailable = true;
            }
        }
        if (!anyAvailable) System.out.println("No available books.");
    }

    public void displayAllBooks() {
        System.out.println("All books in library:");
        if (bookCount == 0) System.out.println("Library is empty.");
        else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayBookInfo();
            }
        }
    }

    public int getBookCount() { return bookCount; }
}
