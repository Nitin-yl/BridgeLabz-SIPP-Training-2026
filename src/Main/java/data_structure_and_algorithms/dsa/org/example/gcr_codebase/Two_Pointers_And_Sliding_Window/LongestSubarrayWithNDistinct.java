package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Two_Pointers_And_Sliding_Window;

import java.util.*;

public class LongestSubarrayWithNDistinct {

    public static int longestSubarray(int[] arr, int n) {

        Map<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {

            freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);

            while (freq.size() > n) {

                freq.put(arr[left], freq.get(arr[left]) - 1);

                if (freq.get(arr[left]) == 0)
                    freq.remove(arr[left]);

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int n = sc.nextInt();

        System.out.println(longestSubarray(arr, n));
    }
}