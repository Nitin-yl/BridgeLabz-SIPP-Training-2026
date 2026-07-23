package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class EngineerPermutations {

    static void permutations(String[] engineers,
                             boolean[] used,
                             List<String> path,
                             List<List<String>> result) {

        if (path.size() == engineers.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < engineers.length; i++) {

            if (used[i])
                continue;

            used[i] = true;
            path.add(engineers[i]);

            permutations(engineers, used, path, result);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        String[] engineers = {"Alice", "Bob", "Charlie"};

        List<List<String>> result = new ArrayList<>();

        permutations(engineers,
                new boolean[engineers.length],
                new ArrayList<>(),
                result);

        System.out.println("All Schedules:");

        for (List<String> schedule : result) {
            System.out.println(schedule);
        }
    }
}