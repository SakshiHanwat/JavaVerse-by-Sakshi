import java.util.Scanner;

public class SumNnaturalNo{
    public static int SumNaturalNo(int n){
        int sum = 0;
        for(int i = 0; i<= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = SumNnaturalNo.SumNaturalNo(n);

        System.out.println(ans);
    }
}
