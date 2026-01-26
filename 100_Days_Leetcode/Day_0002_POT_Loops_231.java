
import java.util.*;
public class Day_0002_POT_Loops_231{
    public static boolean isPowerOfTwo(int n){
        if(n<=0) return false;

        while(n%2 == 0){
            n= n/2;
        }

        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPowerOfTwo(n));
    }
}