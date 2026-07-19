package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Hashing;

import java.util.HashSet;

public class LongestConsecutiveRun {

    public static int longestConsecutiveRun(int[] ids) {

        HashSet<Integer> set = new HashSet<>();

        for (int id : ids)
            set.add(id);

        int longest = 0;

        for (int id : set) {

            if (!set.contains(id - 1)) {

                int current = id;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] ids = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutiveRun(ids));
    }
}