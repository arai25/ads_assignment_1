package task_6;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int a = 2;
        int n = 10;
        int r = f(a, n);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println(r);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /**
     * This method calculates the power of a base raised to an exponent.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of base raised to the power of exponent.
     */
    public static int f(int a, int n) {
        if (n == 0)
            return 1;
        else
            return f(a, n - 1) * a;
    }
}
