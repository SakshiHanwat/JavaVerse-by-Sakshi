public class MinimumPartitioning {

    public static int minPartition(int[] arr) {
        int n = arr.length;

        int sum = 0;
        for (int val : arr) {
            sum += val;
        }

        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        int sum1 = 0;
        for (int j = sum / 2; j >= 0; j--) {
            if (dp[n][j]) {
                sum1 = j;
                break;
            }
        }

        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 11, 5};
        System.out.println(minPartition(arr));
    }
}
