package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

public class StarBrightnessSearch {

    // Binary Search
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // Search in Rotated Sorted Array
    public static int searchRotated(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[left] <= arr[mid]) {

                if (target >= arr[left] && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;

            } else {

                if (target > arr[mid] && target <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    // First Occurrence
    public static int firstOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Last Occurrence
    public static int lastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Find Minimum Element in Rotated Sorted Array
    public static int findMinimum(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid;
        }

        return arr[left];
    }

    public static void main(String[] args) {

        int[] stars = {5, 10, 15, 20, 25, 30, 35, 40};

        int target = 25;

        System.out.println("Binary Search Index: " +
                binarySearch(stars, target));

        int[] rotated = {30, 35, 40, 5, 10, 15, 20, 25};

        System.out.println("Search in Rotated Array Index: " +
                searchRotated(rotated, target));

        int[] repeated = {5, 10, 10, 10, 15, 20, 20, 25};

        System.out.println("First Occurrence of 10: " +
                firstOccurrence(repeated, 10));

        System.out.println("Last Occurrence of 10: " +
                lastOccurrence(repeated, 10));

        System.out.println("Minimum Element in Rotated Array: " +
                findMinimum(rotated));
    }
}
