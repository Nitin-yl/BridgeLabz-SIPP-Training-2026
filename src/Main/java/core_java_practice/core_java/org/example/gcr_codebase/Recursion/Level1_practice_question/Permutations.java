package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Recursion.Level1_practice_question;

import java.util.Scanner;

public class Permutations {
    static void permute(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);

            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        permute(str, "");

        sc.close();
    }
}
