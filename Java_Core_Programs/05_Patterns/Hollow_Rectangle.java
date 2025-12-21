import java.util.*;

public class Hollow_Rectangle {
    public static void HollowRectangle(int tot_rows, int tot_cols){
        for(int i = 1; i<= tot_rows; i++){
            for(int j = 1; j<=tot_cols; j++){
                if(i == 1 || i == tot_rows || j == 1 || j == tot_rows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            int total_rows = sc.nextInt();
            int total_cols = sc.nextInt();

            HollowRectangle(total_rows, total_cols);
    }
}