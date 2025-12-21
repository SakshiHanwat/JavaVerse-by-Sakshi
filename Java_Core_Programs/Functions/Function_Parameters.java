import java.util.*;
public class Function_Parameters{
    public static void printHelloWorld(){
        System.out.println("Hello World");        
        System.out.println("Hello World");        
        System.out.println("Hello World");        
    }
    public static int CalculateSum(int num1 ,int num2)//parameters or formal parameters
    {
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a,b); 
        //arguments or actual parameters

        System.out.println("Sum of two no. "+sum);

        printHelloWorld();  
    }
}
/*parameters used ---- function defination 
 * whereas arguments used --- function calling time 
 */
