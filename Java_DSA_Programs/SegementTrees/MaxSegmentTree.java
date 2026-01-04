public class MaxSegmentTree {

    static int tree[];

    public static void build(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        build(arr, 2 * i + 1, start, mid);
        build(arr, 2 * i + 2, mid + 1, end);

        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static int query(int i, int start, int end, int l, int r) {

        if (r < start || l > end)
            return Integer.MIN_VALUE;

        if (l <= start && end <= r)
            return tree[i];

        int mid = (start + end) / 2;

        return Math.max(
                query(2 * i + 1, start, mid, l, r),
                query(2 * i + 2, mid + 1, end, l, r)
        );
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        tree = new int[4 * arr.length];

        build(arr, 0, 0, arr.length - 1);

        System.out.println(query(0, 0, arr.length - 1, 2, 6));
    }
}
