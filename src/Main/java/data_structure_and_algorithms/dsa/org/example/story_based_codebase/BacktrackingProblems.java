package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingProblems {

    static int N = 4;

    static boolean isSafe(char[][] board, int row, int col) {

        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    static void solveNQueens(char[][] board, int row) {

        if (row == N) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solveNQueens(board, row + 1);

                board[row][col] = '.';
            }
        }
    }

    static void printBoard(char[][] board) {

        System.out.println();

        for (char[] row : board) {
            for (char c : row)
                System.out.print(c + " ");
            System.out.println();
        }
    }

    static void permutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            permutations(left + right, ans + ch);
        }
    }

    static void subsets(int[] arr, int index, List<Integer> subset) {

        if (index == arr.length) {
            System.out.println(subset);
            return;
        }

        subset.add(arr[index]);
        subsets(arr, index + 1, subset);

        subset.remove(subset.size() - 1);
        subsets(arr, index + 1, subset);
    }

    static void combinationSum(int[] arr,
                               int target,
                               int index,
                               List<Integer> current) {

        if (target == 0) {
            System.out.println(current);
            return;
        }

        if (target < 0 || index == arr.length)
            return;

        current.add(arr[index]);

        combinationSum(arr,
                target - arr[index],
                index,
                current);

        current.remove(current.size() - 1);

        combinationSum(arr,
                target,
                index + 1,
                current);
    }

    public static void main(String[] args) {

        // -------- N Queens --------
        System.out.println("===== N Queens =====");

        char[][] board = new char[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = '.';

        solveNQueens(board, 0);

        // -------- Permutations --------
        System.out.println("\n===== Permutations =====");

        permutations("ABC", "");

        // -------- Subsets --------
        System.out.println("\n===== Subsets =====");

        int[] items = {1, 2, 3};

        subsets(items, 0, new ArrayList<>());

        // -------- Combination Sum --------
        System.out.println("\n===== Combination Sum =====");

        int[] numbers = {2, 3, 6, 7};

        combinationSum(numbers,
                7,
                0,
                new ArrayList<>());
    }
}