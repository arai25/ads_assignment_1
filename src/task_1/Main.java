package task_1;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int[] arr = {10, 1, 32, 3, 45};
        int min = f(arr, arr.length);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println(min);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /*
     * This method finds the minimum element in the array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param arr The array of integers.
     * @param n The number of elements in the array.
     * @return The minimum element in the array.
     */
    public static int f(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        return Math.min(arr[n - 1], f(arr, n - 1));
    }
}