package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Recursion_And_Backtracking;

public class WordSearch {

    static boolean search(char[][] board,
                          String word,
                          int index,
                          int row,
                          int col,
                          boolean[][] visited) {

        if (index == word.length())
            return true;

        if (row < 0 || col < 0 ||
                row >= board.length ||
                col >= board[0].length)
            return false;

        if (visited[row][col] ||
                board[row][col] != word.charAt(index))
            return false;

        visited[row][col] = true;

        boolean found =
                search(board, word, index + 1, row + 1, col, visited) ||
                        search(board, word, index + 1, row - 1, col, visited) ||
                        search(board, word, index + 1, row, col + 1, visited) ||
                        search(board, word, index + 1, row, col - 1, visited);

        visited[row][col] = false;

        return found;
    }

    static boolean exists(char[][] board, String word) {

        boolean[][] visited =
                new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (search(board, word, 0, i, j, visited))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        System.out.println(exists(board, "ABCCED"));
    }
}