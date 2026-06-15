package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level1_practice_question;

public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled: String is null.");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
