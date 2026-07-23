package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    static void combinationSum(int[] coins,
                               int target,
                               int start,
                               int sum,
                               List<Integer> path,
                               List<List<Integer>> result) {

        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < coins.length; i++) {

            if (sum + coins[i] > target)
                break;

            path.add(coins[i]);

            combinationSum(coins, target, i,
                    sum + coins[i], path, result);

            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};

        Arrays.sort(coins);

        List<List<Integer>> result = new ArrayList<>();

        combinationSum(coins, 5, 0, 0,
                new ArrayList<>(), result);

        System.out.println("Possible Combinations:");

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
