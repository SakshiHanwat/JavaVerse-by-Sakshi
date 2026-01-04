public class SegmentTreeUpdate {

    static int tree[];

    public static void update(int i, int start, int end, int idx, int val) {

        if (start == end) {
            tree[i] = val;
            return;
        }

        int mid = (start + end) / 2;

        if (idx <= mid)
            update(2 * i + 1, start, mid, idx, val);
        else
            update(2 * i + 2, mid + 1, end, idx, val);

        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        tree = new int[4 * arr.length];

        SegmentTreeBuild.buildTree(arr, 0, 0, arr.length - 1);

        update(0, 0, arr.length - 1, 2, 10);

        System.out.println(tree[0]);
    }
}
