package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Recursion.Level2_practice_question;

public class IncreasingReadings {
    static boolean isIncreasing(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;

        if (arr[index] >= arr[index + 1])
            return false;

        return isIncreasing(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {12, 15, 18, 22, 30};

        System.out.println(isIncreasing(arr, 0));
    }
}
