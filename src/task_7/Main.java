package task_7;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int[] arr = {1, 4, 6, 2};
        f(arr, 0, arr.length - 1);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /**
     * This method reverses the elements of the given array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param arr The array.
     * @param a The starting index of the subarray.
     * @param b The ending index of the subarray.
     */
    public static void f(int[] arr, int a, int b) {
        if (a >= b)
            return;
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
        f(arr, a + 1, b - 1);
    }
}
