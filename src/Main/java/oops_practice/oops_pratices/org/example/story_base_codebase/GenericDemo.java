package Main.java.oops_practice.oops_pratices.org.example.story_base_codebase;

import java.util.ArrayList;
import java.util.List;

class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

class Stack<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public void display() {
        System.out.println(list);
    }
}

class Repository<T> {

    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        System.out.println(data);
    }
}

public class GenericDemo {

    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Nitin", 101);
        pair.display();

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();

        Integer[] numbers = {12, 45, 7, 89, 34};
        System.out.println("Maximum: " + findMax(numbers));

        Repository<String> repository = new Repository<>();
        repository.add("Apple");
        repository.add("Banana");
        repository.add("Mango");

        System.out.println("Repository Data:");
        repository.display();

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Wildcard List:");
        printList(list);
    }
}