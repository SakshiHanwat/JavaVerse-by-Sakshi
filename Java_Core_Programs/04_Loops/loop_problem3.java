import java.util.Scanner;

public class loop_problem3 {
public static void main (String[] args){
Scanner sc = new Scanner (System.in);
int nums; // To hold number

int fact = 1; // To hold factorial

System.out.println("Enter any positive integer: ");
nums = sc.nextInt ();

for(int i=1; i <= nums; i++) {
    fact *= i;

System.out.println("Factorial: "+ fact);
}
}
}