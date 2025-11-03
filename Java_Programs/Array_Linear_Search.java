import java.util.*;

public class Array_Linear_Search{
    public static int LinearSearch(int arr[],int value){
        for(int i = 0; i <arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for array : ");
        int numbers[]=new int[10];

        for(int i = 0; i<numbers.length; i++){
            numbers[i]=sc.nextInt();
        }
        
        System.out.println("Enter key value you want found : ");
        int key = sc.nextInt();

        int index = LinearSearch(numbers,key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at index : "+index);
        }
    }
}

// time co plexity : O(n)
// time complexity is directly propotional to loop