public class Check_Even_Odd{
    public static void main(String[] args) {
        oddOREven(3);
        oddOREven(8);
        oddOREven(12);
    }
    public static void oddOREven(int n){
        int bitMask = 1;
        if((n&bitMask)==0){
            //even number 
            System.out.println("Even no.");
        }else{
            System.out.println("Odd no.");
        }
    }
}