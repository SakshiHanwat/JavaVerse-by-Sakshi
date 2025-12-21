import java.util.*;

public class practice_problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Total_Cost = pencil+ pen+ eraser;
        System.out.println("Total_Cost = "+Total_Cost);

        //Add on - with 18% tax 
        float newTotal = Total_Cost + (0.18f * Total_Cost);
        System.out.println("Bill with 18% tax : "+newTotal);
        
    }
}