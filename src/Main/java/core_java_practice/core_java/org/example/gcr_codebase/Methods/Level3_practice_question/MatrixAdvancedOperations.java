package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

public class MatrixAdvancedOperations {
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] trans = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {

        int det = determinant2x2(m);

        if (det == 0) {
            return null;
        }

        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;

        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {

        int det = determinant3x3(m);

        if (det == 0) {
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1])/(double)det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1])/(double)det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1])/(double)det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0])/(double)det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0])/(double)det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0])/(double)det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0])/(double)det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0])/(double)det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0])/(double)det;

        return inv;
    }

    public static void displayDoubleMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix2 = createMatrix(2, 2);
        int[][] matrix3 = createMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix2));

        System.out.println("\nDeterminant = " +
                determinant2x2(matrix2));

        System.out.println("\nInverse:");
        double[][] inv2 = inverse2x2(matrix2);
        if (inv2 != null)
            displayDoubleMatrix(inv2);
        else
            System.out.println("Inverse not possible");


        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix3));

        System.out.println("\nDeterminant = " +
                determinant3x3(matrix3));

        System.out.println("\nInverse:");
        double[][] inv3 = inverse3x3(matrix3);
        if (inv3 != null)
            displayDoubleMatrix(inv3);
        else
            System.out.println("Inverse not possible");
    }
}
