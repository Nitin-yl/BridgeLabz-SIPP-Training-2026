package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

public class MatrixOperations {
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        int[][] matrixA = createMatrix(rows, cols);
        int[][] matrixB = createMatrix(rows, cols);

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        System.out.println("\nAddition (A + B):");
        printMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nSubtraction (A - B):");
        printMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("\nMultiplication (A × B):");
        printMatrix(multiplyMatrices(matrixA, matrixB));
    }
}
