public class Problem4{
    public static int CalcSum(int n){
        //Base Class 
        if(n == 0){
            return 1;
        }
        int Snm1 = CalcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalcSum(5));
    }
}