package task_9;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int n = 7;
        int k = 3;
        int r = f(n, k);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println(r);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /**
     * This method calculates the binomial coefficient.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient.
     */
    public static int f(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return f(n - 1, k - 1) + f(n - 1, k);
    }
}

