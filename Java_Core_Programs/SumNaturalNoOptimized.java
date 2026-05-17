import java.util.*;

public class SumNaturalNoOptimized{
    public static int SumNnaturalNo(int n){
        int ans = (n*(n+1))/2;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = SumNaturalNoOptimized.SumNnaturalNo(n);

        System.out.println(ans);
    }
}