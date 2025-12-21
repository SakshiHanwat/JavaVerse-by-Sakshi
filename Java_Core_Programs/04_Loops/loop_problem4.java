import java.util.*;

public class loop_problem4 {
    public static void printMultiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table of " + n + " is : " + n + " * " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printMultiplication(num);
    }
}