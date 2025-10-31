import java.util.*;

public class Hollow_Rhombus{
    public static void Hollow_Rhombus_Pattern(int n){
        for(int i =1; i<=n; i++){
            //for space
            for(int j = 1; j<(n-i); j++){
                System.out.print(" ");
            }
            //for star
           for(int j =1; j<=n; j++){
            if(i ==1 || i==n || j ==1 ||j ==n){
            System.out.print("*");
            }
            else{
                 System.out.print(" ");

            }
           }
           System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Hollow_Rhombus_Pattern(n);
    }
}