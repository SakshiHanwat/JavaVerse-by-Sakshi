public class String_Substring{
    public static String Substring(String str,int si,int ei){
        String substr =" ";
        for(int i =si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[]args){
        String str1 = "Hello World";
        System.out.println(Substring(str1,0,5));
    }
}