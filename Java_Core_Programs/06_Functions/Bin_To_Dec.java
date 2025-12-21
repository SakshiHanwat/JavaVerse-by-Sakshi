public class Bin_To_Dec{
    public static void BinToDec(int n){
        int myNum = n;
        int pow = 0;
        int decNum =0;

        while(n >0){
            int lastDigit = n%10;
            decNum = decNum + (lastDigit*(int)Math.pow(2,pow));

            pow++;
            n = n/10;
        }
        System.out.println("Binary form of "+myNum+"= "+decNum);
    }
    public static void main(String[] args) {
        BinToDec(101);
    }
}