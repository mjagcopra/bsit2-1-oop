import java.util.ArrayList;

public class bookRecordSystem {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

    public bookRecordSystem(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }

    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
        System.out.println("Rating " + rating + " added successfully");
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        double sum = 0;
        for (int r : ratings) sum += r;
        return sum / ratings.size();
    }

    public String getPopularityLevel() {
        if (ratings.isEmpty()) return "No ratings";
        double avg = getAverageRating();
        if (avg >= 4.5) return "Excellent";
        else if (avg >= 3.5) return "Good";
        else if (avg >= 2.5) return "Average";
        else if (avg >= 1.5) return "Poor";
        else return "Terrible";
    }

    public void addMultipleRatings(int... ratings) {
        StringBuilder added = new StringBuilder("Ratings added: ");
        boolean first = true;
        for (int r : ratings) {
            try {
                addRating(r);
                if (!first) added.append(", ");
                added.append(r);
                first = false;
            } catch (IllegalArgumentException e) {

                added.append("\nError: ").append(e.getMessage());
            }
        }
        if (!first) {
            System.out.println(added.toString());
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    private String formatRating(double rating) {
        if (rating * 10 % 10 == 0) {
            return String.format("%.1f", rating); // e.g., 4.0
        } else {
            return String.format("%.2f", rating); // e.g., 4.25
        }
    }

    public String displayBook() {
        return "Book: " + title + " by " + author +
                ", Average Rating: " + formatRating(getAverageRating()) +
                ", Level: " + getPopularityLevel();
    }
}

