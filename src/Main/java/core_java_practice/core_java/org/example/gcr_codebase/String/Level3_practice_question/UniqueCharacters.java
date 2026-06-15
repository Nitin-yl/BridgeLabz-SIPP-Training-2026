package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level3_practice_question;

import java.util.Scanner;

public class UniqueCharacters {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);

        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = ch;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(temp, 0, result, 0, uniqueCount);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.print("Unique Characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
