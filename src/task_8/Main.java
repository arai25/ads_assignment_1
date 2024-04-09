package task_8;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        String s = "123a12";
        boolean b = f(s, 0);
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000; // Convert nanoseconds to milliseconds
        if (b)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method checks if a given string consists only of digits.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * Linear time complexity.
     *
     * @param s The string.
     * @param n The index.
     * @return true if the string consists only of digits, false otherwise.
     */
    public static boolean f(String s, int n) {
        if (n == s.length())
            return true;
        char c = s.charAt(n);

        if (!Character.isDigit(c))
            return false;
        return f(s, n + 1);
    }
}

