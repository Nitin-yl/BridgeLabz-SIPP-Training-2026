package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level2_practice_question;

public class RandomNumberStatistics {
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }

        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int[] numbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-Digit Random Numbers:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        double[] result = findAverageMinMax(numbers);

        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + (int) result[1]);
        System.out.println("Maximum = " + (int) result[2]);
    }
}
