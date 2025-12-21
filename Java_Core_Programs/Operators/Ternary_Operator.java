import java.util.*;
public class Ternary_Operator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        String type = ((num1 %2 )== 0)?"even":"odd";
        System.out.println(type);
    }
}