package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardUsageDemo {

    public static void display(List<? extends Number> list) {

        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static List<Integer> getNumbers() {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        return numbers;
    }

    public static void main(String[] args) {

        List<Integer> numbers = getNumbers();

        System.out.println("Numbers:");

        display(numbers);
    }
}