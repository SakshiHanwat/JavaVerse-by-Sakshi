import java.util.*;
//Pairs in an array

public class Array_Subarray_Kadane{
    public static void Max_SubArray_Kadane(int numbers[]){
        int CS =0;
        int MS= Integer.MIN_VALUE;

        for(int i =0; i<numbers.length; i++){
            CS += numbers[i];
            
            if(CS < 0){
                CS = 0;
            }
            MS = Math.max(CS,MS);
        }
            System.out.println("Max sum is : "+MS);

    }

    public static void main(String[]args){
        int numbers[] ={-2,-3,4,-1,-2,1,5,-3};
        Max_SubArray_Kadane(numbers);
    }
}