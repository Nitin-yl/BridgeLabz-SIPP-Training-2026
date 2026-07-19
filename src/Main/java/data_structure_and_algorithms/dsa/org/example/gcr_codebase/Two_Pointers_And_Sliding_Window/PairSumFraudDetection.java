package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Two_Pointers_And_Sliding_Window;

import java.util.Scanner;

public class PairSumFraudDetection {

    public static int[] findPairSum(int[] transactions, int target) {

        int left = 0;
        int right = transactions.length - 1;

        while (left < right) {

            int sum = transactions[left] + transactions[right];

            if (sum == target)
                return new int[]{transactions[left], transactions[right]};

            else if (sum < target)
                left++;
            else
                right--;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        int[] ans = findPairSum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}