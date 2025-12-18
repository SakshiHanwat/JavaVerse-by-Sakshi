public class UpdateIthBit{
    public static int SetIthBit(int n , int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
     public static int ClearIthBitIthBit(int n , int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
   
    public static int UpdateIthBit(int n , int i,int newBit){
        if(newbit == 0){
            return clearIthBit(n,i);
        }
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10,2,1));
    }
}