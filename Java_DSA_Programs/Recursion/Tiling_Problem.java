public class Tiling_Problem{
    public static int Tiling_problem(int n){
        //2*n floor size

        //base case
        if(n==0 || n == 1){
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1 = Tiling_problem(n-1);

        //horizontal choice
        int fnm2 = Tiling_problem(n-2);

        int TotWays = fnm1 +fnm2;
        return TotWays;
    }
    public static void main(String[]args){
        System.out.println(Tiling_problem(3));
    }
}
