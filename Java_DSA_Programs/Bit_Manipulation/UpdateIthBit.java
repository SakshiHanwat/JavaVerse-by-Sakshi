public class UpdateIthBit {

    // Set ith bit (make it 1)
    public static int SetIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // Clear ith bit (make it 0)
    public static int ClearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // Update ith bit according to newBit (0 or 1)
    public static int UpdateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return ClearIthBit(n, i);
        } else {
            return SetIthBit(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 1));
    }
}
