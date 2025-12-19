import java.util.*;
public class Insertion_Sort{

    public static void InsertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
            int curr = i;
            int prev =i-1;
            //finding out the correct pos to insert
            while(prev >=0 && arr[prev] > arr[curr]) {
                arr[prev+1] =arr[prev];
                prev--;
            }
                //insertion
                arr[prev+1] = curr;
        }
        
    }
      public static void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        InsertionSort(arr);
        printArr(arr);
}
}
//time complexity ---- O(N^2)