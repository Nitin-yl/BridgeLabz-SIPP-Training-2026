package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level2_practice_question;

import java.util.Scanner;

public class SplitTextComparison {
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return count;
    }

    public static String[] splitText(String text) {
        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userWords = splitText(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("\nWords using user-defined method:");
        for (String word : userWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both arrays equal? " + result);

        sc.close();
    }
}
