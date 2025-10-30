import java.util.*;

public class Palindrome {
    public static boolean Palindrome_check(int n) {
        int rem;
        int new_n = 0;
        int temp = n;

        while (n > 0) {
            rem = n % 10;
            new_n = (new_n * 10) + rem;
            n = n / 10;
        }
        return new_n == temp ? true : false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(Palindrome_check(num)){
            System.out.println("No. is Palindrome..");
        }
        else{
            System.out.println("No. is not Palindrome..");

        }
    }
}