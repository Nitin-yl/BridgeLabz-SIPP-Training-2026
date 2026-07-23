package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class FeatureFlagSubsets {

    static void generateSubsets(String[] flags, int index,
                                List<String> current,
                                List<List<String>> result) {

        if (index == flags.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(flags[index]);
        generateSubsets(flags, index + 1, current, result);

        current.remove(current.size() - 1);
        generateSubsets(flags, index + 1, current, result);
    }

    public static void main(String[] args) {

        String[] flags = {"DarkMode", "Checkout", "Search"};

        List<List<String>> result = new ArrayList<>();

        generateSubsets(flags, 0, new ArrayList<>(), result);

        System.out.println("Feature Flag Combinations:");
        for (List<String> subset : result) {
            System.out.println(subset);
        }
    }
}