import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i : interactions) {
            total += i;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle + ", Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle + ", Engagement Score: " + engagementScore + ", Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> uniqueHashtags = new ArrayList<>();
        if (hashtags == null) {
            return uniqueHashtags;
        }
        int length = Math.min(hashtags.length, 5);
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < length; i++) {
            String tag = hashtags[i];
            if (tag != null && !seen.contains(tag)) {
                uniqueHashtags.add(tag);
                seen.add(tag);
            }
        }
        return uniqueHashtags;
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null) {
            return trending;
        }
        for (String post : posts) {
            if (post != null) {
                Integer score = postEngagement.get(post);
                if (score != null && score > 500) {
                    trending.add(post);
                }
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors == null) {
            return uniqueAuthors;
        }
        for (String author : authors) {
            if (author != null) {
                uniqueAuthors.add(author);
            }
        }
        return uniqueAuthors;
    }

    public static void main(String[] args) {
        PostManager pm = new PostManager();

        int engagement = pm.calculateEngagement(150, 75, 25);
        String category = pm.getCategoryRating(engagement);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", 250);
        postEngagement.put("Advanced Java Tutorial", 800);
        postEngagement.put("Spring Boot Guide", 650);

        LinkedList<String> trendingPosts = pm.findTrendingPosts(posts, postEngagement);

        HashSet<String> uniqueAuthors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        System.out.println("══ Social Media Post Manager ══");
        System.out.println("Post: Java Programming Tips");
        System.out.println("Engagement Score: " + engagement);
        System.out.println("Category: " + category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trendingPosts);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
