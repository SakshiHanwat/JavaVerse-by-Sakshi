import java.util.ArrayList;

public class Operation_ArrayList_set{
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
         
       //set element at Index
       list.set(2,10);
       System.out.println(list);
       
    }
}
