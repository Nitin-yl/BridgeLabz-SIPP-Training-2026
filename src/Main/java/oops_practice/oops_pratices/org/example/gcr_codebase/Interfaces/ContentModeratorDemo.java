package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Interfaces;

interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy: Offensive words are not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"bad", "hate", "abuse"};

        post = post.toLowerCase();

        for (String word : restrictedWords) {
            if (post.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam Detection Policy: Spam messages are not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println("Offensive Post: " + post);
        }
    }

    @Override
    public void checkSpam(String post) {
        String text = post.toLowerCase();

        if (text.contains("buy now") || text.contains("click here") || text.contains("free")) {
            System.out.println("Spam Post: " + post);
        }
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModeratorDemo {

    public static void main(String[] args) {

        String[] posts = {
                "I love Java programming.",
                "Buy now and get 50% off!",
                "I hate this product.",
                "Click here to win a free phone.",
                "Have a nice day!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:");

        for (String post : posts) {

            String text = post.toLowerCase();

            boolean spam = text.contains("buy now") ||
                    text.contains("click here") ||
                    text.contains("free");

            boolean offensive = TextModeration.containsRestrictedWords(post);

            if (spam) {
                System.out.println("Spam Post: " + post);
            } else if (offensive) {
                System.out.println("Offensive Post: " + post);
            } else {
                System.out.println("Valid Post: " + post);
            }
        }
    }
}