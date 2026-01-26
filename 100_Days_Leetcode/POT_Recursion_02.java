
import java.util.*;
public class POT_Recursion_02{
    public static boolean isPowerOfTwo(int n){
        //base case 
        if(n==1) return true;

        if(n <=0 || n % 2 != 0) return false;

        return isPowerOfTwo(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPowerOfTwo(n));
    }
}