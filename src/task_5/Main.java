package task_5;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int n = 17;
        int f = fun(n);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println(f);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /**
     * This method calculates the n-th element in the Fibonacci sequence.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param n The position of the element.
     * @return The nth element in the sequence.
     */
    public static int fun(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fun(n - 1) + fun(n - 2);
    }
}
