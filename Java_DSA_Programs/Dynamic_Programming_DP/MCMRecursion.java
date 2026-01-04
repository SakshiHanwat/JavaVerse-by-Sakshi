public class MCMRecursion {

    public static int mcm(int arr[], int i, int j) {

        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int cost = mcm(arr, i, k)
                    + mcm(arr, k + 1, j)
                    + arr[i - 1] * arr[k] * arr[j];

            min = Math.min(min, cost);
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;

        System.out.println(mcm(arr, 1, n - 1));
    }
}
