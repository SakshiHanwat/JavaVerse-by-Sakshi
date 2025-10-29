import java.util.*;

public class condition_problem2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("You have Fever");
        } else {
            System.out.println("Ypu don't have fever");
        }
    }
}