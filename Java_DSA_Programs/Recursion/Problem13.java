public class Problem13{
    public static int FriendsPairing(int n) {
        //base case
        if (n == 1 || n == 2) {
            return n;
        }
        /*
        //choice 
        single
        int fnm1 = FriendsPairing(n - 1);
        //pair
        int fnm2 = FriendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;
        //totWays

        int totWays =fnm1 +pairWays;
        return totWays;
        */
       //Shorter version
       return FriendsPairing(n-1)+(n-1)*FriendsPairing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(FriendsPairing(3));
    }
}