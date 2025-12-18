public class ClearLastIthBit{
    public static int ClearIthlastBitIthBit(int n , int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearIthlastBitIthBit(10,2));
    }
}