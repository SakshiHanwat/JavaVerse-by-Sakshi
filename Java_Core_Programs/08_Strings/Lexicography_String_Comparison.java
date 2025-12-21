
public class Lexicography_String_Comparison{
    public static void main(String[]args){
        String fruits[] = {"apple", "mango", "banana"};
        
        String largest = fruits[0];
        for(int i =0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
/*✅ Greedy Approach

Assume first is best

Update when better found

✅ String Comparison

Character by character

Uses ASCII values

O(n * m) --- Time complexity 
Where:

n = number of strings

m = average length of string

✅ Space Complexity
O(1)
Only one variable used
*/