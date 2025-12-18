public class ClearIthBit{
    public static int ClearIthBitIthBit(int n , int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearIthBit(10,2));
    }
}