public class Main {
    // Find minimum in array
    // Time complexity: O(n)
    public static int findMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    // Find average of array
    // Time complexity: O(n)
    public static double findAverage(int[] arr, int n) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / n;
    }

    // Check if number is prime (recursive)
    // Time complexity: O(sqrt(n))
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    // Factorial (recursive)
    // Time complexity: O(n)
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Fibonacci (recursive)
    // Time complexity: O(2^n)
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Power a^n (recursive)
    // Time complexity: O(n)
    public static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Reverse print array using recursion
    // Time complexity: O(n)
    public static void reversePrint(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reversePrint(arr, index - 1);
    }

    // Check if string has only digits
    // Time complexity: O(n)
    public static boolean isAllDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isAllDigits(s, i + 1);
    }

    // Binomial coefficient (recursive)
    // Time complexity: O(2^n)
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    // GCD using Euclidean Algorithm (recursive)
    // Time complexity: O(log(min(a, b)))
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Min: " + findMin(arr, arr.length));
        System.out.println("Avg: " + findAverage(arr, arr.length));
        System.out.println("Is Prime (7): " + isPrime(7, 2));
        System.out.println("Factorial (5): " + factorial(5));

        System.out.println("2^10: " + power(2, 10));
        System.out.print("Reversed: "); reversePrint(new int[]{1, 4, 6, 2}, 3);
        System.out.println("\nAll digits: " + isAllDigits("123456", 0));
        System.out.println("Binomial Coeff (7, 3): " + binomialCoeff(7, 3));
        System.out.println("GCD(32, 48): " + gcd(32, 48));
    }
}
