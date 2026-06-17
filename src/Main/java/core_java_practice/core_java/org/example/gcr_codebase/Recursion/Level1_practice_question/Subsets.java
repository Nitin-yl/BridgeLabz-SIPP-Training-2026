package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Recursion.Level1_practice_question;

public class Subsets {
    static void generateSubsets(int[] arr, int index, String subset) {
        if (index == arr.length) {
            System.out.println("[" + subset + "]");
            return;
        }

        generateSubsets(arr, index + 1, subset);

        if (subset.isEmpty())
            generateSubsets(arr, index + 1, String.valueOf(arr[index]));
        else
            generateSubsets(arr, index + 1, subset + "," + arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};

        generateSubsets(arr, 0, "");
    }
}
