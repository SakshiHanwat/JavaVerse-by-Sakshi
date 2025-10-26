import java.util.*;
public class Function_Parameters{
    public static void printHelloWorld(){
        System.out.println("Hello World");        
        System.out.println("Hello World");        
        System.out.println("Hello World");        
    }
    public static int CalculateSum(int num1 ,int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a,b);

        System.out.println("Sum of two no. "+sum);

        printHelloWorld();  
    }
}