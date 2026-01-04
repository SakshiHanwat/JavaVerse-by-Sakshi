public class MCMMemoization {

    static int dp[][];

    public static int mcm(int arr[], int i, int j) {

        if (i == j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int cost = mcm(arr, i, k)
                    + mcm(arr, k + 1, j)
                    + arr[i - 1] * arr[k] * arr[j];

            min = Math.min(min, cost);
        }
        return dp[i][j] = min;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;

        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(mcm(arr, 1, n - 1));
    }
}
