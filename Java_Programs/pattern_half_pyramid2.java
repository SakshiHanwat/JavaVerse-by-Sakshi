import java.util.*;

public class pattern_half_pyramid2 {
    public static void Half_Pyramid_Number(int n)
    {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        Half_Pyramid_Number(num);
    }
}