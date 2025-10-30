import java.util.*;

public class pattern_01{
    public static void Half_Pyramid_01(int num){
        for(int i = 1; i<=num; i++){
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Half_Pyramid_01(n);
    }
}
