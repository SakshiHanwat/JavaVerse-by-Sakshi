import java.util.*;
public class Switch1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        switch(number){
            case 1: 
                System.out.println("Samosa");
                break;
            case 2: 
                System.out.println("gulaab Jamun");
                break;
            case 3: 
                System.out.println("Milkcake");
                break;
            case 4: 
                System.out.println("Momos");
                break;
            case 5: 
                System.out.println("Noodles");
                break;
            default:System.out.println("We wake up");

        }
    }
}