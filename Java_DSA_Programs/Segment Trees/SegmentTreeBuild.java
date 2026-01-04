public class SegmentTreeBuild {

    static int tree[];

    public static void buildTree(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        buildTree(arr, 2 * i + 1, start, mid);
        buildTree(arr, 2 * i + 2, mid + 1, end);

        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        tree = new int[4 * arr.length];

        buildTree(arr, 0, 0, arr.length - 1);

        System.out.println(tree[0]);
    }
}
