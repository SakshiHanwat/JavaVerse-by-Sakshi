import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;

public class Sorting_ArrayList{
    public static void main(String[] args) {
        
    ArrayList<Integer> list = new ArrayList<>();
        
        //Add element
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(7);
          
        System.out.println(list);
        Collections.sort(list);   //ascending order
        System.out.println(list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
}

}