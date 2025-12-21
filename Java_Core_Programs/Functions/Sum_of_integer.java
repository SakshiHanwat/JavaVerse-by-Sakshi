import java.util.*;

public class Sum_of_integer {

    public static int Sum_of_integer(int n){
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int num = sc.nextInt();
        System.out.println("Sum of integer digits = "+Sum_of_integer(num));

    }
}