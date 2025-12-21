import java.util.*;

public class arithmetic_operator {
    //binary operator 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //Arthmetic operations

        int sum = num1 + num2;
        int sub = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;
        int mod = num1 %num2;

        System.out.println("Sum: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Product: "+product);
        System.out.println("Division: "+div);
        System.out.println("Modulus: "+mod);
    }
}
