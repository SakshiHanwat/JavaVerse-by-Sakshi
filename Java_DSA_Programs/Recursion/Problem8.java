//WAP to find the last occurence of an element in an array

public class Problem8 {

    public static int LastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = LastOccurence(arr, key, i + 1);

        if (isFound != -1) {
            return isFound;
        }

        if (arr[i] == key) {
            return i;
        }

        return -1; // 🔴 missing return fixed
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(LastOccurence(arr, 5, 0));
    }
}
