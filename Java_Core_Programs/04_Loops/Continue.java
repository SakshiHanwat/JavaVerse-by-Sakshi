
import java.util.Scanner;

public class Continue{
    public static void main(String[] args) {
        //Keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
         
        do {
            System.out.print("enter your number: ");
            int n = sc.nextInt();
            if(n%10 ==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
