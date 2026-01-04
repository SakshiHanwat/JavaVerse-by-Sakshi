public class RangeSumQuery {

    static int tree[];

    public static int query(int i, int start, int end, int l, int r) {

        if (r < start || l > end)
            return 0;

        if (l <= start && end <= r)
            return tree[i];

        int mid = (start + end) / 2;

        int left = query(2 * i + 1, start, mid, l, r);
        int right = query(2 * i + 2, mid + 1, end, l, r);

        return left + right;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        tree = new int[4 * arr.length];

        SegmentTreeBuild.buildTree(arr, 0, 0, arr.length - 1);

        System.out.println(query(0, 0, arr.length - 1, 1, 3));
    }
}
