package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level2_practice_question;

import java.util.Scanner;

public class ShortestLongestWord {
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

    public static String[][] getWordAndLength(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static int[] findShortestAndLongest(String[][] data) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < Integer.parseInt(data[shortest][1])) {
                shortest = i;
            }

            if (len > Integer.parseInt(data[longest][1])) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordData = getWordAndLength(words);

        int[] result = findShortestAndLongest(wordData);

        System.out.println("\nShortest Word : "
                + wordData[result[0]][0]
                + " (Length = " + wordData[result[0]][1] + ")");

        System.out.println("Longest Word  : "
                + wordData[result[1]][0]
                + " (Length = " + wordData[result[1]][1] + ")");

        sc.close();
    }
}
