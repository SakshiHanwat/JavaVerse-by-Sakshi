public class Array_Binary_Search{

    public static int BinarySearch(int arr[],int key){
        int start =0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]== key){
                return mid;
            }
            else if(arr[mid] < key){//right condition
                start = mid +1;
            }
            else{//left case
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int numbers[] ={2,4,6,8,10,12,14};
        int value = 10;

        System.out.println("index for key  is: "+BinarySearch(numbers, value));
    }
}

