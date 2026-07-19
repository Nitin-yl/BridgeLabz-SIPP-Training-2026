package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Two_Pointers_And_Sliding_Window;

import java.util.*;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if (s.isEmpty() || t.isEmpty())
            return "";

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        int required = need.size();
        int formed = 0;

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) &&
                    window.get(c).intValue() == need.get(c).intValue())
                formed++;

            while (formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char ch = s.charAt(left);

                window.put(ch, window.get(ch) - 1);

                if (need.containsKey(ch) &&
                        window.get(ch) < need.get(ch))
                    formed--;

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(minWindow(s, t));
    }
}