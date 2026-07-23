package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    static boolean isSafe(int row, int col, int[] queens) {

        for (int i = 0; i < row; i++) {

            if (queens[i] == col)
                return false;

            if (Math.abs(queens[i] - col) == Math.abs(i - row))
                return false;
        }

        return true;
    }

    static void solve(int n,
                      int row,
                      int[] queens,
                      List<List<String>> result) {

        if (row == n) {

            List<String> board = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < n; j++) {

                    if (queens[i] == j)
                        sb.append("Q");
                    else
                        sb.append(".");
                }

                board.add(sb.toString());
            }

            result.add(board);
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, queens)) {

                queens[row] = col;

                solve(n, row + 1, queens, result);
            }
        }
    }

    public static void main(String[] args) {

        List<List<String>> result = new ArrayList<>();

        solve(4, 0, new int[4], result);

        for (List<String> board : result) {

            System.out.println();

            for (String row : board)
                System.out.println(row);
        }
    }
}
