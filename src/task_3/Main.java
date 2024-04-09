package task_3;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int n = 7;
        boolean isPrime = f(n, 2);

        if (isPrime)
            System.out.println(n + " is prime.");
        else
            System.out.println(n + " is not prime.");

        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    /*
    * This method checks whether a given number is prime.
    * It uses a recursive approach.
    * Time complexity: O(n), where n is the input number.
    * Linear time complexity.
    *
    * @param n The number to be checked.
    * @param k The current divisor being tested.
    * @return true if the number is prime, false otherwise.
    */
    public static boolean f(int n, int k) {
        if (n <= 1)
            return false;
        if (k == n)
            return true;
        if (n % k == 0)
            return false;
        return f(n, k + 1);
    }
}