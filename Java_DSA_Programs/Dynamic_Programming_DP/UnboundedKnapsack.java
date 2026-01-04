public class UnboundedKnapsack {

    public static int unboundedKnapsack(int[] wt, int[] val, int W) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(
                            val[i - 1] + dp[i][j - wt[i - 1]],
                            dp[i - 1][j]
                    );
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] wt = {2, 3, 4};
        int[] val = {5, 6, 8};
        int W = 6;
        System.out.println(unboundedKnapsack(wt, val, W));
    }
}
