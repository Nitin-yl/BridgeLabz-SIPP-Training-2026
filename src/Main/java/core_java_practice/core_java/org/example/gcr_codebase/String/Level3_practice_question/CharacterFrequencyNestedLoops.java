package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level3_practice_question;

import java.util.Scanner;

public class CharacterFrequencyNestedLoops {
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;

            if (chars[i] == '0')
                continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        int count = 0;
        for (char aChar : chars) {
            if (aChar != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        for (String s : result) {
            String[] parts = s.split(" : ");
            System.out.println(parts[0] + "\t\t" + parts[1]);
        }

        sc.close();
    }
}
