import java.util.*;
public class Product_Function{
    public static int CalculateProduct(int num1 ,int num2)//parameters or formal parameters
    {
        int product = num1*num2;
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateProduct(a,b); 
        //arguments or actual parameters

        System.out.println("Product of two no. "+sum);

    }
}
/*parameters used ---- function defination 
 * whereas arguments used --- function calling time 
 */