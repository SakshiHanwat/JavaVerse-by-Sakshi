import java.util.*;

public class Inverted_Rotated {
    public static void Inverted_Rotated_Star(int n) {
        for (int i = 1; i <= n; i++) {
            //print spaces 
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Inverted_Rotated_Star(size);
    }
}