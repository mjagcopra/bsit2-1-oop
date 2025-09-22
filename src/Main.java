public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");


        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);


        Library library = new Library();
        System.out.println("Adding books to library...");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println();


        library.displayAllBooks();
        System.out.println();


        library.borrowBook("1234567890");
        System.out.println();


        System.out.println("Trying to borrow Java Programming again...");
        library.borrowBook("1234567890");
        System.out.println();


        library.displayAvailableBooks();
        System.out.println();


        library.returnBook("1234567890");
        System.out.println();


        System.out.println("Testing validation...");
        try {

            Book invalidBook = new Book("Invalid Book", "No Author", "1234567890", 1400);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {

            Book invalidBook2 = new Book("Another Invalid", "No Author", "123", 2020);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
