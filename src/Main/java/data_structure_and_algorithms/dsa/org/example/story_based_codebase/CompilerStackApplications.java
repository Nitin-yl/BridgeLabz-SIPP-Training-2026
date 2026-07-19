package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.*;

public class CompilerStackApplications {

    // 1. Balanced Brackets Validator
    public static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '['))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    // 2. Next Greater Price
    public static int[] nextGreaterPrice(int[] price) {

        int n = price.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    price[i] > price[stack.peek()]) {

                ans[stack.pop()] = price[i];
            }

            stack.push(i);
        }

        return ans;
    }

    // 3. Stock Span
    public static int[] stockSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    price[stack.peek()] <= price[i]) {

                stack.pop();
            }

            if (stack.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - stack.peek();

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        // Balanced Brackets
        String code = "{[()]}";

        System.out.println("Balanced Brackets: " + isBalanced(code));

        // Next Greater Price
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Next Greater Price:");
        System.out.println(Arrays.toString(nextGreaterPrice(prices)));

        // Stock Span
        System.out.println("Stock Span:");
        System.out.println(Arrays.toString(stockSpan(prices)));
    }
}
