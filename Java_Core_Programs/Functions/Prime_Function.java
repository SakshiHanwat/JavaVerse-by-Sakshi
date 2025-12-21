public class Prime_Function {
    public static boolean isPrime(int n){
        //corner case 
        if (n == 2){
            return true;
        }
      //  boolean isPrime = true;
        for(int i = 2; i<=n-1; i++){//completely dividing
            if(n%i == 0){
               // isPrime = false;
               return false;
            }
        }
        //return isPrime;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}