import java.util.*;

public class Solid_Rhombus{
    public static void Solid_Rhombus_Pattern(int n){
        for(int i =1; i<=n; i++){
            //for space
            for(int j = 1; j<(n-i); j++){
                System.out.print(" ");
            }
            //for star
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solid_Rhombus_Pattern(n);
    }
}