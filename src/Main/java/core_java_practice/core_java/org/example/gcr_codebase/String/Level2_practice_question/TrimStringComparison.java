package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level2_practice_question;

import java.util.Scanner;

public class TrimStringComparison {
    public static int[] trimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);

        String userTrimmed = createSubstring(text, indexes[0], indexes[1]);
        String builtInTrimmed = text.trim();

        boolean result = compareStrings(userTrimmed, builtInTrimmed);

        System.out.println("User-defined Trim : \"" + userTrimmed + "\"");
        System.out.println("Built-in Trim     : \"" + builtInTrimmed + "\"");
        System.out.println("Are both strings equal? " + result);

        sc.close();
    }
}
