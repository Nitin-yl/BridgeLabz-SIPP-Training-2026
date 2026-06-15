package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level1_practice_question;

import java.util.Scanner;

public class StringComparison {
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

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean charAtResult = compareStrings(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println("Using charAt() method: " + charAtResult);
        System.out.println("Using equals() method: " + equalsResult);

        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}
