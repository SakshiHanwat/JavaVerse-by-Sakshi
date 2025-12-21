public class Dec_To_Bin{

    public static void DecToBin(int n){
        int myNum=n;
        int pow=0;
        int Bin_num=0;

        while(n>0){
            int rem = n%2;
            Bin_num = Bin_num +(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of "+myNum+"= "+Bin_num);
      }
        public static void main(String[]args){
            DecToBin(5);
    }
}