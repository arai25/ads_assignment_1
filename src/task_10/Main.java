package task_10;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int a = 32;
        int b = 48;
        int gcd = f(a, b);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println(gcd);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /**
     * This method calculates the GCD of two numbers using the Euclidean Algorithm.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of two numbers.
     */
    public static int f(int a, int b) {
        if (b == 0)
            return a;
        return f(b, a % b);
    }
}

