package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Hashing;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySumEqualsK(int[] arr, int k) {

        HashMap<Integer, Integer> prefix = new HashMap<>();

        prefix.put(0, 1);

        int sum = 0;
        int answer = 0;

        for (int value : arr) {

            sum += value;

            answer += prefix.getOrDefault(sum - k, 0);

            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] revenue = {1, 2, 3, -3, 2};

        System.out.println(subarraySumEqualsK(revenue, 3));
    }
}