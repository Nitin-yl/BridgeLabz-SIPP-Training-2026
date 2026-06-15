package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

public class FootballTeamHeight {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];

        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }

        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];

        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Player Heights (cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nMean Height: " + findMean(heights) + " cm");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
    }
}
