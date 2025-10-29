import java.util.*;

public class condition_problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Given number is negative " + number);
        }
        else {
            System.out.println("Given number is non-negative"+number);
        }
    }
}