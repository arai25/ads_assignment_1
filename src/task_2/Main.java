package task_2;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int[] arr = {3, 2, 4, 1};
        double average = f(arr, arr.length);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println(average);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /*
     * This method calculates the average of elements in the given array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param arr The array of integers.
     * @param n The number of elements in the array.
     * @return The average of elements in the array.
     */
    public static double f(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else
            return (f(arr, n - 1) * (n - 1) + arr[n - 1]) / n;
    }
}