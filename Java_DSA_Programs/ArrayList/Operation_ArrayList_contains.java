import java.util.ArrayList;

public class Operation_ArrayList_contains{
    public static void main(String[] args) {
        //Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        
        //Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
         
        //contains element
         System.out.println((list.contains(1)));

         //add elemnt at index
         list.add(1,9);
         System.out.println(list);
    }
}
