// Print Nth Fibonacci number
public class Problem5{
    public static int Fibbonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fibbonacci(n-1);
        int fnm2 = Fibbonacci(n-2);
        int fn = fnm1 +fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fibbonacci(n));
    }
}