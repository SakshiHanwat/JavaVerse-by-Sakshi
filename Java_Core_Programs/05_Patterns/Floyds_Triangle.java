import java.util.*;

public class Floyds_Triangle {

    public static void Floyds_Triangle_pattern(int num) {
        int count =0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
            count++;
                System.out.print(count + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Floyds_Triangle_pattern(n);
    }
}