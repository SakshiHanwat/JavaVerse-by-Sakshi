import java.util.ArrayList;

public class Maximum_ArrayList{
    public static void main(String[] args) {
        //Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        
        //Add element
        list.add(2);
         list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(7);
         
        //maximum
        int max = Integer.MIN_VALUE;
        for(int i =0; i <list.size(); i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
            //max =Math.max(max, list.get(i));
        }
        System.out.println("Max element = " +max);
    }
}