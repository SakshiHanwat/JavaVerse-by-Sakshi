import java.util.Scanner;

class Day_0003_Fibonacci_509 {

    // Fibonacci function (recursion)
    public static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);

        sc.close();
    }
}
