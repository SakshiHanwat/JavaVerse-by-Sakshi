public class SortZeroOne {

    static void sortZeroOne(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 1, 0};

        sortZeroOne(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
