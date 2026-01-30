import java.util.Scanner;

class Day_0005_Water_Bottles_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {

        int drinkBottle = 0;   // total bottles pee chuke
        int emptyBottle = 0;   // empty bottles count

        while (numBottles > 0) {
            // peena
            drinkBottle += numBottles;
            emptyBottle += numBottles;

            // exchange karna
            numBottles = emptyBottle / numExchange;
            emptyBottle = emptyBottle % numExchange;
        }

        return drinkBottle;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of full bottles: ");
        int numBottles = sc.nextInt();

        System.out.print("Enter number of empty bottles to exchange for one full bottle: ");
        int numExchange = sc.nextInt();

        int result = sol.numWaterBottles(numBottles, numExchange);
        System.out.println("Total bottles you can drink: " + result);

        sc.close();
    }
}
