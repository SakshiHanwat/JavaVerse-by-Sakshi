import java.util.ArrayList;

public class Size_ArrayList{
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
         
      System.out.println(list.size());
      //print the arraylist
      for(int i =0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
      } 
      System.out.println();
    }
}
