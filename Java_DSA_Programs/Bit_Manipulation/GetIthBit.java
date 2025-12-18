public class GetIthBit{
    public static int GetIthBit(int n , int i){
        int bitmask = 1<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(GetIthBit(10,2));
    }
}