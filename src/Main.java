import com.sun.tools.javac.Main;

public class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed"));
        System.out.println();
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned '" + title + "'. Thank you!");
        } else {
            System.out.println("'" + title + "' was not borrowed.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Data Structures and Algorithms", "Janzen Reid", 281);
        Book book2 = new Book("Object Oriented Programming", " Mike Janzen", 328);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();

        book2.borrowBook();
        book3.borrowBook();
        book3.returnBook();
    }
}
