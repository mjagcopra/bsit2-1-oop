public class main {
    public static void main(String[] args) {
        System.out.println("=== Book Record System ===\n");
        System.out.println("Adding books and ratings...");

        bookRecordSystem b1 = new bookRecordSystem("Java Programming", "John Smith");
        bookRecordSystem b2 = new bookRecordSystem("Data Structures", "Alice Brown");
        bookRecordSystem b3 = new bookRecordSystem("Web Development", "Bob Wilson");

        try {
            b1.addRating(4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        b1.addMultipleRatings(5, 4, 3, 5, 0); // includes invalid

        try {
            b2.addRating(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        b2.addMultipleRatings(4, 4, 5);

        b3.addMultipleRatings(2, 3, 2, 5);

        System.out.println("\nBook Results:");
        System.out.println(b1.displayBook());
        System.out.println(b2.displayBook());
        System.out.println(b3.displayBook());

        System.out.println("\nTotal books created: " + bookRecordSystem.getTotalBooks());

        bookRecordSystem bestBook = b1;
        if (b2.getAverageRating() > bestBook.getAverageRating()) bestBook = b2;
        if (b3.getAverageRating() > bestBook.getAverageRating()) bestBook = b3;

        System.out.println("Highest rated book: " + bestBook.getTitle() + " by " +
                bestBook.getAuthor() + " (" + String.format("%.2f", bestBook.getAverageRating()) + ")");
    }
}
