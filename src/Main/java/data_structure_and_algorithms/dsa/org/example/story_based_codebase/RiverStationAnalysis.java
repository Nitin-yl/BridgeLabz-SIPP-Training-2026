package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.*;

public class RiverStationAnalysis {

    // Longest Contiguous Period Within a Range
    public static int longestPeriodWithinRange(int[] levels, int limit) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < levels.length; right++) {

            map.put(levels[right], map.getOrDefault(levels[right], 0) + 1);

            while (map.lastKey() - map.firstKey() > limit) {

                map.put(levels[left], map.get(levels[left]) - 1);

                if (map.get(levels[left]) == 0)
                    map.remove(levels[left]);

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Find All Unique Triplets with Sum = 0
    public static List<List<Integer>> threeSum(int[] pollution) {

        Arrays.sort(pollution);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < pollution.length - 2; i++) {

            if (i > 0 && pollution[i] == pollution[i - 1])
                continue;

            int left = i + 1;
            int right = pollution.length - 1;

            while (left < right) {

                int sum = pollution[i] + pollution[left] + pollution[right];

                if (sum == 0) {

                    result.add(Arrays.asList(
                            pollution[i],
                            pollution[left],
                            pollution[right]));

                    while (left < right &&
                            pollution[left] == pollution[left + 1])
                        left++;

                    while (left < right &&
                            pollution[right] == pollution[right - 1])
                        right--;

                    left++;
                    right--;

                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }

        return result;
    }

    // Maximum Average Subarray of Length K
    public static double maxAverage(int[] arr, int k) {

        int windowSum = 0;

        for (int i = 0; i < k; i++)
            windowSum += arr[i];

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] waterLevels = {4, 2, 2, 3, 6, 5, 4, 3};
        int limit = 2;

        System.out.println("Longest Period Within Range: "
                + longestPeriodWithinRange(waterLevels, limit));

        int[] pollution = {-1, 0, 1, 2, -1, -4};

        System.out.println("Triplets with Zero Pollution Index:");
        System.out.println(threeSum(pollution));

        int[] readings = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println("Maximum Average of Subarray: "
                + maxAverage(readings, k));
    }
}