package Main.java.core_java_practice.core_java.org.example.story_base_codebase;

public class RecursionDemo {

    static int moves = 0;

    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moves++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moves++;

        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;
        else if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);
        else
            return binarySearch(arr, mid + 1, high, target);
    }

    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static String reverseString(String str) {
        if (str.isEmpty())
            return "";

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isBalanced(String str) {
        return check(str, 0, 0);
    }

    private static boolean check(String str, int index, int count) {
        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        char ch = str.charAt(index);

        if (ch == '(')
            return check(str, index + 1, count + 1);
        else if (ch == ')')
            return check(str, index + 1, count - 1);
        else
            return check(str, index + 1, count);
    }

    public static void main(String[] args) {

        int n = 3;
        System.out.println("Tower of Hanoi:");
        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moves);

        int[] prices = {100, 200, 300, 400, 500, 600};
        int target = 400;
        int index = binarySearch(prices, 0, prices.length - 1, target);
        System.out.println("\nBinary Search:");
        System.out.println("Element found at index: " + index);

        int number = 12345;
        System.out.println("\nSum of Digits:");
        System.out.println(sumOfDigits(number));

        String str = "Recursion";
        System.out.println("\nReverse String:");
        System.out.println(reverseString(str));

        String exp = "((())())";
        System.out.println("\nBalanced Parentheses:");
        System.out.println(isBalanced(exp));
    }
}