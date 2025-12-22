public class Quick_Sort_Implementation{
    public static void QuickSort(int arr[],int si , int ei){
        if(si>=ei){
            return;
        }
        int pi = partition(arr,si,ei);
        QuickSort(arr,si,pi-1);
        QuickSort(arr,pi+1,ei);
    }       

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr []= {6,3,9,5,2,8};
        QuickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}