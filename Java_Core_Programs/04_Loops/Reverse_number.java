import java.util.*;

public class Reverse_number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        while(num >0){
            int lastDigit = num%10;
            System.out.print(lastDigit+ " ");
            num = num/10;
        }
        System.out.println();
    }
} 
