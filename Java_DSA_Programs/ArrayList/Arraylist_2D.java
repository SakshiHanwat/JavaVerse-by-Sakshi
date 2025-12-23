import java.util.ArrayList;

public class Arraylist_2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i * 1);
            list1.add(i * 2);
            list2.add(i * 3);
        }

        mainlist.add(list);
        mainlist.add(list1);
        mainlist.add(list2);

        System.out.println(mainlist);
    }
}
