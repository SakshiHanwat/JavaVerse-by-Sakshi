import java.util.*;

public class Functions_Bino {

    public static int factorial(int a){
        int f = 1;
        for(int i = 1; i<=a; i++){
            f = f*i;
        }
        return f;
    }
    public static int Bin_Coffe(int a , int b){
        int fact_a = factorial(a);
        int fact_b = factorial(b);
        int fact_amb = factorial(a-b);

        int bino_coffe = (fact_a)/(fact_b*fact_amb);

        return bino_coffe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int avg = Bin_Coffe(n, r);
        System.out.println(avg);
    }
}
    