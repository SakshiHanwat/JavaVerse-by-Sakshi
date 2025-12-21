import java.util.*;

public class function_problem2 {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
        isEven(num);

    }
}