package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Stacks;

import java.util.*;

public class BalancedBrackets {

    public static boolean isValidConfig(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '['))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "{[()]}";

        System.out.println(isValidConfig(s));
    }
}