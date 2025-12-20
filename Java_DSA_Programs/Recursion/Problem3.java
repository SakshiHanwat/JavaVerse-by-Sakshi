// Print factorial of a number n 
//n! = n*(n-1)!
public class Problem3 {

    public static int Factorial(int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        int fnm1 = Factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(Factorial(n));
    }
}
