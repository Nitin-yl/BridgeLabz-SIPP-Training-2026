package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Stacks;

import java.util.*;

public class NextGreaterElement {

    public static int[] nextBusierDay(int[] visitors) {

        int n = visitors.length;

        int[] answer = new int[n];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    visitors[i] > visitors[stack.peek()]) {

                answer[stack.pop()] = visitors[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] visitors = {4, 5, 2, 25};

        int[] ans = nextBusierDay(visitors);

        System.out.println(Arrays.toString(ans));
    }
}