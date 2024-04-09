package task_4;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int number = 5;
        int f = fun(number);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println(f);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /**
     * This method calculates the factorial of a given number.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param n The number to find the factorial of.
     * @return The factorial of the given number.
     */
    public static int fun(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return fun(n - 1) * n;
    }
}

