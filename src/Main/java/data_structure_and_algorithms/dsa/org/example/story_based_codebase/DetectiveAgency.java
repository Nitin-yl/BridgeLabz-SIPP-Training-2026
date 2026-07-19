package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.*;

public class DetectiveAgency {

    public static void main(String[] args) {

        HashMap<String, List<String>> suspectCases = new HashMap<>();

        suspectCases.put("John", Arrays.asList("C1", "C2", "C3"));
        suspectCases.put("Alice", Arrays.asList("C1", "C2"));
        suspectCases.put("Bob", Arrays.asList("C2", "C3"));
        suspectCases.put("David", Arrays.asList("C1", "C2"));
        suspectCases.put("Eva", Arrays.asList("C4"));

        String mostInvestigated = "";
        int maxCases = 0;

        for (Map.Entry<String, List<String>> entry : suspectCases.entrySet()) {

            if (entry.getValue().size() > maxCases) {
                maxCases = entry.getValue().size();
                mostInvestigated = entry.getKey();
            }
        }

        System.out.println("Most Investigated Suspect:");
        System.out.println(mostInvestigated + " -> " + maxCases + " cases");

        System.out.println("\nSuspects in Exactly 2 Cases:");

        for (Map.Entry<String, List<String>> entry : suspectCases.entrySet()) {

            if (entry.getValue().size() == 2) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("\nPairs Always Seen Together:");

        List<String> suspects = new ArrayList<>(suspectCases.keySet());

        for (int i = 0; i < suspects.size(); i++) {

            for (int j = i + 1; j < suspects.size(); j++) {

                String s1 = suspects.get(i);
                String s2 = suspects.get(j);

                if (suspectCases.get(s1).equals(suspectCases.get(s2))) {
                    System.out.println(s1 + " & " + s2);
                }
            }
        }

        int[] arr = {1, 2, 3, -2, 5, -3, 1};
        int k = 6;

        System.out.println("\nSubarray with Sum = " + k + ":");

        findSubarray(arr, k);
    }

    static void findSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            if (map.containsKey(prefixSum - k)) {

                int start = map.get(prefixSum - k) + 1;

                System.out.println("Found from index "
                        + start + " to " + i);

                return;
            }

            map.putIfAbsent(prefixSum, i);
        }

        System.out.println("No Subarray Found");
    }
}