public class CountSetBits{
    public static int CountSetBitsFun(int n){
        int count = 0; 
        while(n>0){
            if((n&1)!= 0){
                //Check our LSt
                count++;
            }
            n =n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountSetBitsFun(16));
    }
}