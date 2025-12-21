import java.util.*;

public class Function_Swap{
    public static void Swap(int a ,int b){
        int temp = a;
        a = b;
        b= temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Swap(num1 ,num2);
    }
}