import java.util.*;
public class Two_Largest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 >num2){
            System.out.println("Num1: "+ num1 +" is greater than "+"Num2: "+num2);
        }
        else{
                        System.out.println("Num2: "+ num2 +" is greater than "+"Num1: "+num1);

        }
    }
}