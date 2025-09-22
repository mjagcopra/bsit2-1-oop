public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setIsbn(isbn);
        this.setYearPublished(yearPublished);
        this.isAvailable = true;
    }


    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) throw new IllegalArgumentException("Invalid title");
        this.title = title;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) throw new IllegalArgumentException("Invalid author");
        this.author = author;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        if (isbn == null || !(isbn.length() == 10 || isbn.length() == 13))
            throw new IllegalArgumentException("Invalid ISBN. ISBN must be 10 or 13 characters long");
        this.isbn = isbn;
    }

    public int getYearPublished() { return yearPublished; }
    public void setYearPublished(int yearPublished) {
        if (yearPublished < 1450 || yearPublished > 2025)
            throw new IllegalArgumentException("Invalid year provided. Year must be between 1450 and 2025");
        this.yearPublished = yearPublished;
    }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { this.isAvailable = available; }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }


    public void displayBookInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | ISBN: " + isbn + " | Year: " + yearPublished + " |");
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed"));
    }
}
