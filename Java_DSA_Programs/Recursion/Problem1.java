//Print numbers from n to 1 (Decreasing order) By Recursion

public class Problem1{
    public static void printDec(int n){
        //Base case
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[]args){
        int n = 10;
        printDec(n);
    }
}