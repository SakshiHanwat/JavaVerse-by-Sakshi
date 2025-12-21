import java.util.*;

public class Print_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int n = sc.nextInt();
        while(counter <=n){
            System.out.println(counter);
            counter++;
        }
    }
}
