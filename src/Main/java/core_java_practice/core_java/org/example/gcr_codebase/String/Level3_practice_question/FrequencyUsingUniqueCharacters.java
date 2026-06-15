package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level3_practice_question;

import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[count++] = ch;
            }
        }

        char[] result = new char[count];
        System.arraycopy(temp, 0, result, 0, count);

        return result;
    }

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = Character.toString(unique[i]);
            result[i][1] = Integer.toString(freq[unique[i]]);
        }

        return result;
    }

    public static void display(String[][] result) {
        System.out.println("\nCharacter\tFrequency");

        for (String[] strings : result) {
            System.out.println(strings[0] + "\t\t" + strings[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        display(result);

        sc.close();
    }
}
