package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

import java.util.Arrays;
import java.util.List;

public class GenericStreamDemo {

    public static <T> void printElements(List<T> list) {

        list.stream()
                .forEach(element -> System.out.println(element));
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Nitin",
                "Rahul",
                "Priya",
                "Aman"
        );

        List<Integer> marks = Arrays.asList(
                85,
                90,
                78,
                95
        );

        System.out.println("Names:");
        printElements(names);

        System.out.println("\nMarks:");
        printElements(marks);
    }
}