public class Clear_RangeIthBit{
    public static int Clear_rangeIthBit(int n , int i,int j){
        int a=((~0)<<(j+1));
        int b=(i<<i)-1;
        int bitmask =a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Clear_rangeIthBit(10,2,1));
    }
}