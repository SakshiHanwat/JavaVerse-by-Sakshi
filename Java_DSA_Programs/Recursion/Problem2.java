//Print numbers from n to 1 (Increasing order) By Recursion

public class Problem2{
    public static void printInc(int n){
        //Base case
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[]args){
        int n = 10;
        printInc(n);
    }
}