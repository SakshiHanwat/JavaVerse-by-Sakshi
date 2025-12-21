import java.util.*;
public class Three_Largest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if((num1 >=num2) && (num1>= num3)){
            System.out.println("Num1: "+ num1 +" is greater.");
        }
        else if(num2>= num3){
            System.out.println("Num2: "+ num2 +" is greater.");
        }
        else{
                        System.out.println("Num3: "+ num3 +" is greater.");

        }
    }
}