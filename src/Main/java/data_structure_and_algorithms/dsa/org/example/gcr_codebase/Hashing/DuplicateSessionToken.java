package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Hashing;

import java.util.HashSet;

public class DuplicateSessionToken {

    public static boolean hasDuplicateToken(String[] tokens) {

        HashSet<String> seen = new HashSet<>();

        for (String token : tokens) {

            if (!seen.add(token))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String[] tokens = {"A12", "B45", "C78", "A12"};

        System.out.println(hasDuplicateToken(tokens));
    }
}