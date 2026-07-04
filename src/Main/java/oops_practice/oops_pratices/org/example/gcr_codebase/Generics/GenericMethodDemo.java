package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

public class GenericMethodDemo {

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40};

        String[] names = {"Nitin", "Rahul", "Priya"};

        Double[] marks = {85.5, 90.0, 78.5};

        System.out.println("Integer Array:");
        printArray(numbers);

        System.out.println("\nString Array:");
        printArray(names);

        System.out.println("\nDouble Array:");
        printArray(marks);
    }
}