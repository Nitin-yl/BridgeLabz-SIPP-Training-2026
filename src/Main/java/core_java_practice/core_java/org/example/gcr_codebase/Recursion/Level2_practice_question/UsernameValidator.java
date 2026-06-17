package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Recursion.Level2_practice_question;

public class UsernameValidator {
    static boolean isValid(String str, int index) {
        if (index == str.length())
            return true;

        char ch = str.charAt(index);

        if (ch < 'a' || ch > 'z')
            return false;

        return isValid(str, index + 1);
    }

    public static void main(String[] args) {

        String username = "abcdxyz";

        System.out.println(isValid(username, 0));
    }
}
