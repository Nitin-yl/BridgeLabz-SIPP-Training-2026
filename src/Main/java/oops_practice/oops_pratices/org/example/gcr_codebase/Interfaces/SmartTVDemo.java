package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Interfaces;

interface StreamingService {

    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium Plan");
    }
}

interface GamingService {

    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold Plan");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming Movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing Game: " + game);
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class SmartTVDemo {

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Inception",
                "Interstellar"
        };

        String[] games = {
                "FIFA 25",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        System.out.println("Subscription Details:");
        tv.showSubscriptionDetails();

        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            tv.streamMovie(movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            tv.playGame(game);
        }
    }
}